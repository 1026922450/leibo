package hua.gan.msf.modules.main.controller;

import hua.gan.msf.common.enums.MsfModulesEnum;
import hua.gan.msf.common.web.MsfBaseController;
import hua.gan.msf.modules.main.bo.UserBodyBO;
import hua.gan.msf.modules.main.service.IUbAttrTempService;
import hua.gan.msf.modules.main.vo.UbAttrTempVO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wulian.common.exception.CcpErrorCode;
import com.wulian.common.exception.CcpException;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 拓扑图相关控制层
 * 
 * <功能详细描述>
 * </pre>
 *
 * @author  xuganhua
 * @version  [版本号, 2015-6-28]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Controller
@RequestMapping(value="/topo")
public class UbAttrTempController extends MsfBaseController
{
    
    @Autowired
    private IUbAttrTempService iTopoService;
    
    @RequestMapping(value="/searchUbAttrs")
    public ResponseEntity<String> searchUbAttrs(@ModelAttribute UserBodyBO userBodyBO)
    {
        
        logger.info(userBodyBO.toString());
        
        String retCode = null;
        List<UbAttrTempVO> attrTempList = null;
        try
        {
            attrTempList = iTopoService.searchUbAttrs(userBodyBO);
            retCode = CcpErrorCode.SUCCESS.name();
        }
        catch (CcpException e)
        {
            logger.error(MsfModulesEnum.MAIN.name(), e);
            retCode = e.getErrorCode().name();
        }
        catch (Exception e)
        {
            logger.error(MsfModulesEnum.MAIN.name(), e);
            retCode = CcpErrorCode.ERROR_CCP_INTERNAL.name();
        }
        
        return getResponseEntity(retCode, attrTempList);
    }
    
    
}
