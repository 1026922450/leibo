package hua.gan.msf.modules.main.service;

import hua.gan.msf.modules.main.bo.UserBodyBO;
import hua.gan.msf.modules.main.vo.UbAttrTempVO;

import java.util.List;

import com.wulian.common.exception.CcpException;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 图谱图相关service
 * 
 * <功能详细描述>
 * </pre>
 *
 * @author  xuganhua
 * @version  [版本号, 2015-6-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public interface IUbAttrTempService
{
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
    public List<UbAttrTempVO> searchUbAttrs(UserBodyBO userBodyBO)
        throws CcpException;
}
