package hua.gan.msf.modules.main.dao.impl;

import hua.gan.msf.modules.main.dao.IUbAttrTempDao;
import hua.gan.msf.modules.main.vo.UbAttrTempVO;
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
 * <pre>
 * <一句话功能简述>
 * 
 * 拓扑图相关dao实现
 * 
 * <功能详细描述>
 * </pre>
 *
 * @author  xuganhua
 * @version  [版本号, 2015-6-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@Repository
public class UbAttrTempDaoImpl extends CcpBaseDao implements IUbAttrTempDao
{
    /** 日志 */
    private static Logger logger = LoggerFactory.getLogger(UbAttrTempDaoImpl.class);
    
    /** 
     * <pre>
     * <一句话功能简述>
     * 
     * 查询指定干系体的所有属性信息
     * 
     * <功能详细描述>
     * </pre>
     * @param ubAttrTempVO
     * @return
     * @throws CcpException
     * @see [类、类#方法、类#成员]
     */
    @Override
    public List<UbAttrTempVO> searchUbAttrs(UbAttrTempVO ubAttrTempVO)
        throws CcpException
    {
        try
        {
            logger.info(ubAttrTempVO.toString());
            
            StringBuffer sql = new StringBuffer();
            sql.append("select ");
            sql.append("a.XP_UBAT_ID as ubatId,a.XP_UBAT_UB_ID as ubatUbId,c.XP_UB_Name as ubatUbName,a.XP_UBAT_UBG_ID as ubatUbgId,d.XP_UBG_Name as ubatUbgName,a.XP_UBAT_Att_ID as ubatAttId,b.XP_Att_Name as ubatAttName,a.XP_UBAT_Att_Value as ubatAttValue ");
            sql.append("from xp_ub_attr_temp a ");
            sql.append("join xp_attribute b on b.XP_Att_ID = a.XP_UBAT_Att_ID ");
            sql.append("join xp_user_body c on a.XP_UBAT_UB_ID = c.XP_UB_ID ");
            sql.append("join xp_ub_group d on d.XP_UBG_ID = a.XP_UBAT_UBG_ID ");
            sql.append("where a.XP_UBAT_UB_ID = :ubatUbId");
            
            return queryForList(sql.toString(), ubAttrTempVO, UbAttrTempVO.class);
            
        }
        catch(Exception e)
        {
            throw new CcpException(CcpErrorCode.ERROR_DB_EXECUTE_FAIL ,e);
        }
        
    }

    @Override
    public CcpPagination<UbAttrTempVO> search(UbAttrTempVO ubAttrTempVO, int currentPage, int pageSize)
        throws CcpException
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int save(TempletVO templetVO)
        throws CcpException
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(TempletVO templetVO)
        throws CcpException
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(TempletVO templetVO)
        throws CcpException
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public TempletVO get(TempletVO templetVO)
        throws CcpException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
