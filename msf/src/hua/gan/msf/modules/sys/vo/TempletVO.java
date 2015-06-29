package hua.gan.msf.modules.sys.vo;

import java.sql.Date;

import com.wulian.common.jdbc.CcpBaseVO;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 模板VO
 * 
 * <功能详细描述>
 * </pre>
 * 
 * @author xuganhua
 * @version [版本号, 2015-6-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class TempletVO extends CcpBaseVO
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 8006966485384265191L;
    
    public static final String TABLE_NAME = "xp_templet";
    public static final String FIELD_TEM_ID = "xp_templet.XP_Tem_ID";
    public static final String FIELD_TEM_NAME = "xp_templet.XP_Tem_Name";
    public static final String FIELD_TEM_DESC = "xp_templet.XP_Tem_Desc";
    public static final String FIELD_DEL_FLAG = "xp_templet.XP_Del_Flag";
    public static final String FIELD_ADD_DATE = "xp_templet.XP_Add_Date";
    public static final String FIELD_UPDATE_DATE = "xp_templet.XP_Update_Date";
    public static final String VALUE_TEM_ID = ":temId";
    public static final String VALUE_TEM_NAME = ":temName";
    public static final String VALUE_TEM_DESC = ":temDesc";
    public static final String VALUE_DEL_FLAG = ":delFlag";
    public static final String VALUE_ADD_DATE = ":addDate";
    public static final String VALUE_UPDATE_DATE = ":updateDate";
    
    /**
     * 模板编号
     */
    private int temId;
    
    /**
     * 模板名称
     */
    private String temName;
    
    /**
     * 模板描述
     */
    private String temDesc;
    
    /**
     * 删除标记 0未删 1已删
     */
    private int delFlag = 0;
    
    /**
     * 模板新增时间
     */
    private Date addDate;
    
    /**
     * 模板更新时间
     */
    private Date updateDate;
    
    /**
     * 获取 temId
     * 
     * @return 返回 temId
     */
    public int getTemId()
    {
        return temId;
    }
    
    /**
     * 设置 temId
     * 
     * @param 对temId进行赋值
     */
    public void setTemId(int temId)
    {
        this.temId = temId;
    }
    
    /**
     * 获取 temName
     * 
     * @return 返回 temName
     */
    public String getTemName()
    {
        return temName;
    }
    
    /**
     * 设置 temName
     * 
     * @param 对temName进行赋值
     */
    public void setTemName(String temName)
    {
        this.temName = temName;
    }
    
    /**
     * 获取 temDesc
     * 
     * @return 返回 temDesc
     */
    public String getTemDesc()
    {
        return temDesc;
    }
    
    /**
     * 设置 temDesc
     * 
     * @param 对temDesc进行赋值
     */
    public void setTemDesc(String temDesc)
    {
        this.temDesc = temDesc;
    }
    
    /**
     * 获取 delFlag
     * 
     * @return 返回 delFlag
     */
    public int getDelFlag()
    {
        return delFlag;
    }
    
    /**
     * 设置 delFlag
     * 
     * @param 对delFlag进行赋值
     */
    public void setDelFlag(int delFlag)
    {
        this.delFlag = delFlag;
    }
    
    /**
     * 获取 addDate
     * 
     * @return 返回 addDate
     */
    public Date getAddDate()
    {
        return addDate;
    }
    
    /**
     * 设置 addDate
     * 
     * @param 对addDate进行赋值
     */
    public void setAddDate(Date addDate)
    {
        this.addDate = addDate;
    }
    
    /**
     * 获取 updateDate
     * 
     * @return 返回 updateDate
     */
    public Date getUpdateDate()
    {
        return updateDate;
    }
    
    /**
     * 设置 updateDate
     * 
     * @param 对updateDate进行赋值
     */
    public void setUpdateDate(Date updateDate)
    {
        this.updateDate = updateDate;
    }
    
    @Override
    public String toString()
    {
        return "TempletVO [temId=" + temId + ", temName=" + temName + ", temDesc=" + temDesc + ", delFlag=" + delFlag
            + ", addDate=" + addDate + ", updateDate=" + updateDate + "]";
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((addDate == null) ? 0 : addDate.hashCode());
        result = prime * result + delFlag;
        result = prime * result + ((temDesc == null) ? 0 : temDesc.hashCode());
        result = prime * result + temId;
        result = prime * result + ((temName == null) ? 0 : temName.hashCode());
        result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TempletVO other = (TempletVO)obj;
        if (addDate == null)
        {
            if (other.addDate != null)
                return false;
        }
        else if (!addDate.equals(other.addDate))
            return false;
        if (delFlag != other.delFlag)
            return false;
        if (temDesc == null)
        {
            if (other.temDesc != null)
                return false;
        }
        else if (!temDesc.equals(other.temDesc))
            return false;
        if (temId != other.temId)
            return false;
        if (temName == null)
        {
            if (other.temName != null)
                return false;
        }
        else if (!temName.equals(other.temName))
            return false;
        if (updateDate == null)
        {
            if (other.updateDate != null)
                return false;
        }
        else if (!updateDate.equals(other.updateDate))
            return false;
        return true;
    }
    
}
