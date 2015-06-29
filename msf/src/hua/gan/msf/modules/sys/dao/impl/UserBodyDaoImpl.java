package hua.gan.msf.modules.sys.dao.impl;

import hua.gan.msf.modules.sys.dao.IUserBodyDao;
import hua.gan.msf.modules.sys.vo.UserBodyVO;

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
 * 实体管理接口实现
 *
 * <功能详细描述>
 * 
 * @author  xuganhua
 * @version  [版本号, 2015-6-28]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Repository
public class UserBodyDaoImpl extends CcpBaseDao implements IUserBodyDao
{
    /** 日志 */
    private static Logger logger = LoggerFactory.getLogger(UserBodyDaoImpl.class);
    
    @Override
    public CcpPagination<UserBodyVO> search(UserBodyVO userBodyVO, int currentPage, int pageSize)
        throws CcpException
    {
        try
        {
            logger.info("userBodyVO:{}", userBodyVO.toString());
            
            StringBuffer sql = new StringBuffer();
            sql.append("select ");
            sql.append("a.XP_Tem_ID, a.XP_Tem_Name, a.XP_Tem_Desc ");
            sql.append("from " + UserBodyVO.TABLE_NAME + " a ");
            sql.append("where a.XP_Tem_Del_Flag = :temDelFlag ");
            sql.append("order by a.XP_Tem_Update_Date desc");
            
            logger.info("sql:{}", sql.toString());
            
            return super.queryForList(sql.toString(), userBodyVO, UserBodyVO.class, currentPage, pageSize);
        }
        catch(Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    @Override
    public List<UserBodyVO> search(UserBodyVO userBodyVO)
        throws CcpException
    {
        try
        {
            logger.info("userBodyVO:{}", userBodyVO.toString());
            
            StringBuffer sql = new StringBuffer();
            sql.append("select ");
            sql.append("a.XP_Tem_ID, a.XP_Tem_Name, a.XP_Tem_Desc ");
            sql.append("from " + UserBodyVO.TABLE_NAME + " a ");
            sql.append("where a.XP_Tem_Del_Flag = :temDelFlag ");
            sql.append("order by a.XP_Tem_Update_Date desc ");
            
            logger.info("sql:{}", sql.toString());
            
            return queryForList(sql.toString(), userBodyVO, UserBodyVO.class);
        }
        catch(Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    @Override
    public int save(UserBodyVO userBodyVO)
        throws CcpException
    {
        try
        {
            logger.info("userBodyVO:{}", userBodyVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("insert into " + UserBodyVO.TABLE_NAME + " a ");
            sql.append("(a.XP_Tem_Name,a.XP_Tem_Desc,a.XP_Tem_Del_Flag,a.XP_Tem_Add_Date,a.XP_Tem_Update_Date) ");
            sql.append("values(:temName,:temDesc,:temDelFlag,now(),now()) ");
            
            logger.info("sql:{}", sql.toString());
            
            return super.update(sql.toString(), userBodyVO);
        }
        catch(Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    @Override
    public int update(UserBodyVO userBodyVO)
        throws CcpException
    {
        try
        {
            logger.info("userBodyVO:{}", userBodyVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("update " + UserBodyVO.TABLE_NAME + " a ");
            sql.append("set a.XP_Tem_Name = :temName, ");
            sql.append("a.XP_Tem_Desc = :temDesc, ");
            sql.append("a.XP_Tem_Update_Date = now() ");
            sql.append("where a.XP_Tem_Del_Flag = :temDelFlag and a.XP_Tem_ID = :temId ");
            
            logger.info("sql:{}", sql.toString());
            
            return super.update(sql.toString(), userBodyVO);
        }
        catch (Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    @Override
    public int delete(UserBodyVO userBodyVO)
        throws CcpException
    {
        try
        {
            logger.info("userBodyVO:{}", userBodyVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("update " + UserBodyVO.TABLE_NAME + " a ");
            sql.append("set a.XP_Tem_Del_Flag = :temDelFlag, ");
            sql.append("a.XP_Tem_Update_Date = now() ");
            sql.append("where a.XP_Tem_ID = :temId ");
            
            logger.info("sql:{}", sql.toString());
            
            return super.update(sql.toString(), userBodyVO);
        }
        catch (Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
    @Override
    public UserBodyVO get(UserBodyVO userBodyVO)
        throws CcpException
    {
        try
        {
            logger.info("userBodyVO:{}", userBodyVO.toString());
            
            StringBuilder sql = new StringBuilder();
            sql.append("select ");
            sql.append("a.XP_Tem_ID as temId, aXP_Tem_Name as temName, a.XP_Tem_Desc as temDesc ");
            sql.append("from " + UserBodyVO.TABLE_NAME + " a ");
            sql.append("where a.XP_Tem_Del_Flag = :temDelFlag and a.XP_Tem_ID = :temId");
            
            logger.info("sql:{}", sql.toString());
            
            return super.queryForObject(sql.toString(), userBodyVO, UserBodyVO.class);
        }
        catch (Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL, e);
        }
    }
    
}
