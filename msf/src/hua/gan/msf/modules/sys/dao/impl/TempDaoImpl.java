package hua.gan.msf.modules.sys.dao.impl;

import hua.gan.msf.modules.sys.dao.ITempDao;
import hua.gan.msf.modules.sys.vo.TempletVO;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.wulian.common.exception.CcpErrorCode;
import com.wulian.common.exception.CcpException;
import com.wulian.common.jdbc.CcpBaseDao;
import com.wulian.common.jdbc.CcpPagination;

/**
 * <一句话功能简述>
 *
 * 模板管理接口实现
 *
 * <功能详细描述>
 * 
 * @author  xuganhua
 * @version  [版本号, 2015-6-28]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Repository
public class TempDaoImpl extends CcpBaseDao implements ITempDao
{
    /** 日志 */
    private static Logger logger = LoggerFactory.getLogger(TempDaoImpl.class);
    
    /** 
     * <一句话功能简述>
     *
     * 分页查询所有的模板信息
     *
     * <功能详细描述>
     * @param templetVO
     * @param currentPage
     * @param pageSize
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public CcpPagination<TempletVO> search(TempletVO templetVO, int currentPage, int pageSize)
        throws CcpException
    {
        
        try
        {
            logger.info("templetVO:{}", templetVO.toString());
            
            StringBuffer sql = new StringBuffer();
            sql.append("select ");
            sql.append(TempletVO.FIELD_TEM_ID + ", " + TempletVO.FIELD_TEM_NAME +", " + TempletVO.FIELD_TEM_DESC + " ");
            sql.append("from " + TempletVO.TABLE_NAME + " ");
            sql.append("where " + TempletVO.FIELD_DEL_FLAG +" = " + TempletVO.VALUE_DEL_FLAG);
            sql.append("order by " + TempletVO.FIELD_UPDATE_DATE + " desc");
            
            logger.info("sql:{}", sql.toString());
            
            return super.queryForList(sql.toString(), templetVO, TempletVO.class, currentPage, pageSize);
        }
        catch(Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
        
    }
    
    /** 
     * <一句话功能简述>
     *
     * 查询所有符合条件的模板信息
     *
     * <功能详细描述>
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public List<TempletVO> search(TempletVO templetVO)
        throws CcpException
    {
        try
        {
            logger.info("templetVO:{}", templetVO.toString());
            
            StringBuffer sql = new StringBuffer();
            sql.append("select ");
            sql.append(TempletVO.FIELD_TEM_ID + ", " + TempletVO.FIELD_TEM_NAME + ", " + TempletVO.FIELD_TEM_DESC + " ");
            sql.append("from " + TempletVO.TABLE_NAME + " ");
            sql.append("where " + TempletVO.FIELD_DEL_FLAG + " = " + TempletVO.VALUE_DEL_FLAG);
            sql.append("order by " +TempletVO.FIELD_UPDATE_DATE + " desc ");
            
            logger.info("sql:{}", sql.toString());
            
            return queryForList(sql.toString(), templetVO, TempletVO.class);
        }
        catch(Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    /** 
     * <一句话功能简述>
     *
     * 新增模板信息
     *
     * <功能详细描述>
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public int save(TempletVO templetVO)
        throws CcpException
    {
        
        try
        {
            logger.info("templetVO:{}", templetVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("insert into " + TempletVO.TABLE_NAME + " ");
            sql.append("(" + TempletVO.FIELD_TEM_NAME +", " + TempletVO.FIELD_TEM_DESC + " ," + TempletVO.FIELD_DEL_FLAG + ", " + TempletVO.FIELD_ADD_DATE + ", " + TempletVO.FIELD_UPDATE_DATE + ") ");
            sql.append("values(" + TempletVO.VALUE_TEM_NAME + ", " + TempletVO.VALUE_TEM_DESC + ", " + TempletVO.VALUE_DEL_FLAG + ", now(), now()) ");
            
            logger.info("sql:{}", sql.toString());
            
            return super.update(sql.toString(), templetVO);
        }
        catch(Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    /** 
     * <一句话功能简述>
     *
     * 更新指定的模板信息
     *
     * <功能详细描述>
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public int update(TempletVO templetVO)
        throws CcpException
    {
        try
        {
            logger.info("templetVO:{}", templetVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("update " + TempletVO.TABLE_NAME + " ");
            sql.append("set " + TempletVO.FIELD_TEM_NAME +" = " + TempletVO.VALUE_TEM_NAME + ", ");
            sql.append(TempletVO.FIELD_TEM_DESC + " = " + TempletVO.VALUE_TEM_DESC + ", ");
            sql.append(TempletVO.FIELD_UPDATE_DATE + " = now() ");
            sql.append("where " + TempletVO.FIELD_DEL_FLAG + " = " + TempletVO.VALUE_DEL_FLAG +" and " + TempletVO.FIELD_TEM_ID +" = " + TempletVO.VALUE_TEM_ID);
            
            logger.info("sql:{}", sql.toString());
            
            return super.update(sql.toString(), templetVO);
        }
        catch (Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    /** 
     * <一句话功能简述>
     *
     * 删除指定的模板信息
     *
     * <功能详细描述>
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public int delete(TempletVO templetVO)
        throws CcpException
    {
        try
        {
            logger.info("templetVO:{}", templetVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("update " + TempletVO.TABLE_NAME + " ");
            sql.append("set " + TempletVO.FIELD_DEL_FLAG + " = " +TempletVO.VALUE_DEL_FLAG + ", ");
            sql.append(TempletVO.FIELD_UPDATE_DATE + " = now() ");
            sql.append("where " + TempletVO.FIELD_TEM_ID + " = " + TempletVO.VALUE_TEM_ID);
            
            logger.info("sql:{}", sql.toString());
            
            return super.update(sql.toString(), templetVO);
        }
        catch (Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    /** 
     * <一句话功能简述>
     *
     * 查询指定的模板信息
     *
     * <功能详细描述>
     * @param templetVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public TempletVO get(TempletVO templetVO)
        throws CcpException
    {
        try
        {
            logger.info("templetVO:{}", templetVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("select ");
            sql.append(TempletVO.FIELD_TEM_ID + ", " + TempletVO.FIELD_TEM_NAME +", " + TempletVO.FIELD_TEM_DESC + " ");
            sql.append("from " + TempletVO.TABLE_NAME + " ");
            sql.append("where " + TempletVO.FIELD_DEL_FLAG +" = " + TempletVO.VALUE_DEL_FLAG + " and " + TempletVO.FIELD_TEM_ID + " = " + TempletVO.VALUE_TEM_ID);
            
            logger.info("sql:{}", sql.toString());
            
            return super.queryForObject(sql.toString(), templetVO, TempletVO.class);
        }
        catch (Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
}
