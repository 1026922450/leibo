package hua.gan.msf.common.web;

import hua.gan.msf.common.constants.OmsConstants;
import hua.gan.msf.common.enums.MsfModulesEnum;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.wulian.common.exception.CcpErrorCode;
import com.wulian.common.exception.CcpException;
import com.wulian.common.json.CcpJacksonkMapper;

/**
 * 
 * <pre>
 * <一句话功能简述>
 * Controller基类
 * <功能详细描述>
 * 1、将一些公共的读写、校验功能有基类统一处理
 * </pre>
 * 
 * @author xuganhua
 * @version [版本号, 2015年5月23日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public abstract class MsfBaseController
{
    
    /**
     * 日志对象
     */
    protected Logger logger = LoggerFactory.getLogger(getClass());
    
    /**
     * 
     * <pre>
     * <一句话功能简述>
     * 将数据转换成ResponseEntity
     * <功能详细描述>
     * 只支持带响应码的接口
     * </pre>
     * 
     * @param retCode 业务响应码
     * @return ResponseEntity
     * @see [类、类#方法、类#成员]
     */
    protected ResponseEntity<String> getResponseEntity(String retCode)
    {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "application/json; charset=utf-8");
        
        if (StringUtils.isEmpty(retCode))
        {
            logger.error(MsfModulesEnum.CCP.name(), "retCode is null");
            retCode = CcpErrorCode.ERROR_CCP_INTERNAL.name();
        }
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("retCode", retCode);
        
        String responseMsg;
        
        try
        {
            responseMsg = CcpJacksonkMapper.convertObjectToString(map);
        }
        catch (CcpException e)
        {
            logger.error(MsfModulesEnum.CCP.name(), e);
            responseMsg = OmsConstants.RPS_MSG_TEMPLATE.replace(OmsConstants.CHARACTER_INTERROGATION, CcpErrorCode.ERROR_CCP_INTERNAL.name());
            
        }
        
        logger.info("retCode[{}]", retCode);
        
        return new ResponseEntity<String>(responseMsg, responseHeaders, HttpStatus.OK);
    }
    
    /**
     * 
     * <pre>
     * <一句话功能简述>
     * 将数据转换成ResponseEntity
     * <功能详细描述>
     * </pre>
     * 
     * @param retCode 业务响应码
     * @param data 响应数据
     * @return ResponseEntity
     * @see [类、类#方法、类#成员]
     */
    protected ResponseEntity<String> getResponseEntity(String retCode, Object data)
    {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "application/json; charset=utf-8");
        
        if (StringUtils.isEmpty(retCode))
        {
            logger.error(MsfModulesEnum.CCP.name(), "retCode is null");
            retCode = CcpErrorCode.ERROR_CCP_INTERNAL.name();
        }
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("retCode", retCode);
        map.put("retData", data);
        
        String responseMsg;
        
        try
        {
            responseMsg = CcpJacksonkMapper.convertObjectToString(map);
        }
        catch (CcpException e)
        {
            logger.error(MsfModulesEnum.CCP.name(), e);
            responseMsg =
                OmsConstants.RPS_MSG_TEMPLATE.replace(OmsConstants.CHARACTER_INTERROGATION,
                    CcpErrorCode.ERROR_CCP_INTERNAL.name());
        }
        
        logger.info("retCode[{}],{}", retCode, responseMsg);
        
        return new ResponseEntity<String>(responseMsg, responseHeaders, HttpStatus.OK);
    }
    
    
    /**
     * 
     * <pre>
     * <一句话功能简述>
     * 初始化数据绑定
     * <功能详细描述>
     *  1. 将所有传递进来的String进行HTML编码，防止XSS攻击 
     *  2. 将字段中Date类型转换为String类型
     * </pre>
     * @param binder
     * @see [类、类#方法、类#成员]
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder)
    {        
        System.out.println("sss");
    }
    
}
