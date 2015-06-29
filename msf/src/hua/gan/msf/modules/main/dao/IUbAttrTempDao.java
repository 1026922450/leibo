package hua.gan.msf.modules.main.dao;

import hua.gan.msf.modules.main.vo.UbAttrTempVO;
import hua.gan.msf.modules.sys.vo.TempletVO;

import java.util.List;

import com.wulian.common.exception.CcpException;
import com.wulian.common.jdbc.CcpPagination;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 关联关系管理dao
 * 
 * <功能详细描述>
 * </pre>
 * 
 * @author xuganhua
 * @version [版本号, 2015-6-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface IUbAttrTempDao
{
    /**
     * <pre>
     * <一句话功能简述>
     * 
     * 查询指定干系体的所有属性信息
     * 
     * <功能详细描述>
     * </pre>
     * 
     * @param ubAttrTempVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public List<UbAttrTempVO> searchUbAttrs(UbAttrTempVO ubAttrTempVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 分页查询所有的关联关系信息
     * 
     * <功能详细描述>
     * 
     * @param ubAttrTempVO
     * @param currentPage
     * @param pageSize
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public CcpPagination<UbAttrTempVO> search(UbAttrTempVO ubAttrTempVO, int currentPage, int pageSize)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 新增关联关系信息
     * 
     * <功能详细描述>
     * 
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public int save(TempletVO templetVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 修改关联关系信息
     * 
     * <功能详细描述>
     * 
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public int update(TempletVO templetVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 删除关联关系信息
     * 
     * <功能详细描述>
     * 
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public int delete(TempletVO templetVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 查询指定的关联关系信息
     * 
     * <功能详细描述>
     * 
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public TempletVO get(TempletVO templetVO)
        throws CcpException;
}
