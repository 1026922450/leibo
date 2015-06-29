package hua.gan.msf.modules.sys.dao;

import hua.gan.msf.modules.sys.vo.TempletVO;

import java.util.List;

import com.wulian.common.exception.CcpException;
import com.wulian.common.jdbc.CcpPagination;

/**
 * <一句话功能简述>
 * 
 * 模板管理接口
 * 
 * <功能详细描述>
 * 
 * @author xuganhua
 * @version [版本号, 2015-6-28]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface ITempDao
{
    /**
     * <一句话功能简述>
     * 
     * 分页查询所有的模板信息
     * 
     * <功能详细描述>
     * 
     * @param templetVO
     * @param currentPage
     * @param pageSize
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public CcpPagination<TempletVO> search(TempletVO templetVO, int currentPage, int pageSize)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 查询符合条件的所有模板信息
     * 
     * <功能详细描述>
     * 
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    public List<TempletVO> search(TempletVO templetVO)
        throws CcpException;
    
    /**
     * <一句话功能简述>
     * 
     * 新增模板信息
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
     * 修改模板信息
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
     * 删除模板信息
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
     * 查询指定的模板信息
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
