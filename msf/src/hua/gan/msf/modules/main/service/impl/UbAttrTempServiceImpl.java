package hua.gan.msf.modules.main.service.impl;

import hua.gan.msf.modules.main.bo.UserBodyBO;
import hua.gan.msf.modules.main.dao.IUbAttrTempDao;
import hua.gan.msf.modules.main.service.IUbAttrTempService;
import hua.gan.msf.modules.main.vo.UbAttrTempVO;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wulian.common.exception.CcpErrorCode;
import com.wulian.common.exception.CcpException;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 图谱图相关service实现
 * 
 * <功能详细描述>
 * </pre>
 *
 * @author  xuganhua
 * @version  [版本号, 2015-6-28]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Service(value = "topoService")
public class UbAttrTempServiceImpl implements IUbAttrTempService
{
    /** 日志 */
    private static Logger logger = LoggerFactory.getLogger(UbAttrTempServiceImpl.class);
    
    @Autowired
    private IUbAttrTempDao iTopoDao;
    
    /** 
     * <pre>
     * <一句话功能简述>
     * 
     * 查询指定实体的所有属性信息
     * 
     * <功能详细描述>
     * </pre>
     * @param ubAttrTempVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public List<UbAttrTempVO> searchUbAttrs(UserBodyBO userBodyBO)
        throws CcpException
    {
        
        try
        {
            UbAttrTempVO ubAttrTempVO = new UbAttrTempVO();
            ubAttrTempVO.setUbatUbId(userBodyBO.getUbId());
            
            List<UbAttrTempVO> attrTempList = iTopoDao.searchUbAttrs(ubAttrTempVO);
            
            return attrTempList;
        }
        catch (CcpException e)
        {
            throw e;
        }
        catch (Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_CCP_INTERNAL);
        }
    }
    
}
