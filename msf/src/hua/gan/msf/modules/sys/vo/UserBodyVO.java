package hua.gan.msf.modules.sys.vo;

import com.wulian.common.jdbc.CcpBaseVO;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 实体VO
 * 
 * <功能详细描述>
 * </pre>
 *
 * @author  xuganhua
 * @version  [版本号, 2015-6-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UserBodyVO extends CcpBaseVO
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -7094898056203040186L;
    
    /**
     * 实体表表名
     */
    public static final String TABLE_NAME = "xp_user_body";
    
    /**
     * 实体编号
     */
    private int ubId;
    
    /**
     * 实体登录名
     */
    private String ubLoginName;
    
    /**
     * 实体名称
     */
    private String ubName;
    
    /**
     * 实体描述
     */
    private String ubDesc;
    
    /**
     * 获取 ubId
     * 
     * @return 返回 ubId
     */
    public int getUbId()
    {
        return ubId;
    }
    
    /**
     * 设置 ubId
     * 
     * @param 对ubId进行赋值
     */
    public void setUbId(int ubId)
    {
        this.ubId = ubId;
    }
    
    /**
     * 获取 ubLoginName
     * 
     * @return 返回 ubLoginName
     */
    public String getUbLoginName()
    {
        return ubLoginName;
    }
    
    /**
     * 设置 ubLoginName
     * 
     * @param 对ubLoginName进行赋值
     */
    public void setUbLoginName(String ubLoginName)
    {
        this.ubLoginName = ubLoginName;
    }
    
    /**
     * 获取 ubName
     * 
     * @return 返回 ubName
     */
    public String getUbName()
    {
        return ubName;
    }
    
    /**
     * 设置 ubName
     * 
     * @param 对ubName进行赋值
     */
    public void setUbName(String ubName)
    {
        this.ubName = ubName;
    }
    
    /**
     * 获取 ubDesc
     * 
     * @return 返回 ubDesc
     */
    public String getUbDesc()
    {
        return ubDesc;
    }
    
    /**
     * 设置 ubDesc
     * 
     * @param 对ubDesc进行赋值
     */
    public void setUbDesc(String ubDesc)
    {
        this.ubDesc = ubDesc;
    }
    
    @Override
    public String toString()
    {
        return "UserBodyVO [ubId=" + ubId + ", ubLoginName=" + ubLoginName + ", ubName=" + ubName + ", ubDesc="
            + ubDesc + "]";
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ubDesc == null) ? 0 : ubDesc.hashCode());
        result = prime * result + ubId;
        result = prime * result + ((ubLoginName == null) ? 0 : ubLoginName.hashCode());
        result = prime * result + ((ubName == null) ? 0 : ubName.hashCode());
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
        UserBodyVO other = (UserBodyVO)obj;
        if (ubDesc == null)
        {
            if (other.ubDesc != null)
                return false;
        }
        else if (!ubDesc.equals(other.ubDesc))
            return false;
        if (ubId != other.ubId)
            return false;
        if (ubLoginName == null)
        {
            if (other.ubLoginName != null)
                return false;
        }
        else if (!ubLoginName.equals(other.ubLoginName))
            return false;
        if (ubName == null)
        {
            if (other.ubName != null)
                return false;
        }
        else if (!ubName.equals(other.ubName))
            return false;
        return true;
    }
    
}
