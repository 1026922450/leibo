package hua.gan.msf.modules.sys.dao;

import hua.gan.msf.modules.sys.vo.UserBodyVO;

import java.util.List;

import com.wulian.common.exception.CcpException;
import com.wulian.common.jdbc.CcpPagination;

/**
 * <一句话功能简述>
 * 
 * 实体管理接口
 * 
 * <功能详细描述>
 * 
 * @author xuganhua
 * @version [版本号, 2015-6-28]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface IUserBodyDao
{
    /**
     * <一句话功能简述>
     * 
     * 分页查询所有的实体信息
     * 
     * <功能详细描述>
     * 
     * @param userBodyVO
     * @param currentPage
     * @param pageSize
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public CcpPagination<UserBodyVO> search(UserBodyVO userBodyVO, int currentPage, int pageSize)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 查询符合条件的所有实体信息
     * 
     * <功能详细描述>
     * 
     * @param userBodyVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public List<UserBodyVO> search(UserBodyVO userBodyVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 新增实体信息
     * 
     * <功能详细描述>
     * 
     * @param userBodyVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public int save(UserBodyVO userBodyVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 修改实体信息
     * 
     * <功能详细描述>
     * 
     * @param userBodyVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public int update(UserBodyVO userBodyVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 删除实体信息
     * 
     * <功能详细描述>
     * 
     * @param userBodyVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public int delete(UserBodyVO userBodyVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 查询指定的实体信息
     * 
     * <功能详细描述>
     * 
     * @param userBodyVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public UserBodyVO get(UserBodyVO userBodyVO)
        throws CcpException;
    
}
