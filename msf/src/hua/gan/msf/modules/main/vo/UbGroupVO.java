package hua.gan.msf.modules.main.vo;

import com.wulian.common.jdbc.CcpBaseVO;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 实体组VO
 * 
 * <功能详细描述>
 * </pre>
 *
 * @author  xuganhua
 * @version  [版本号, 2015-6-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class UbGroupVO extends CcpBaseVO
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 3261809302500890093L;
    
    /**
     * 实体组表表名
     */
    public static final String TABLE_NAME = "xp_ub_group";
    
    /**
     * 实体组编号
     */
    private int ubgId;
    
    /**
     * 实体组名称
     */
    private String ubgName;
    
    /**
     * 实体组描述
     */
    private String ubgDesc;
    
    /**
     * 获取 ubgId
     * 
     * @return 返回 ubgId
     */
    public int getUbgId()
    {
        return ubgId;
    }
    
    /**
     * 设置 ubgId
     * 
     * @param 对ubgId进行赋值
     */
    public void setUbgId(int ubgId)
    {
        this.ubgId = ubgId;
    }
    
    /**
     * 获取 ubgName
     * 
     * @return 返回 ubgName
     */
    public String getUbgName()
    {
        return ubgName;
    }
    
    /**
     * 设置 ubgName
     * 
     * @param 对ubgName进行赋值
     */
    public void setUbgName(String ubgName)
    {
        this.ubgName = ubgName;
    }
    
    /**
     * 获取 ubgDesc
     * 
     * @return 返回 ubgDesc
     */
    public String getUbgDesc()
    {
        return ubgDesc;
    }
    
    /**
     * 设置 ubgDesc
     * 
     * @param 对ubgDesc进行赋值
     */
    public void setUbgDesc(String ubgDesc)
    {
        this.ubgDesc = ubgDesc;
    }
    
    /**
     * <pre>
     * <一句话功能简述>
     * <功能详细描述>
     * </pre>
     * 
     * @return
     * @see [类、类#方法、类#成员]
     */
    @Override
    public String toString()
    {
        return "UbGroupVO [ubgId=" + ubgId + ", ubgName=" + ubgName + ", ubgDesc=" + ubgDesc + "]";
    }
    
    /**
     * <pre>
     * <一句话功能简述>
     * <功能详细描述>
     * </pre>
     * 
     * @return
     * @see [类、类#方法、类#成员]
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ubgDesc == null) ? 0 : ubgDesc.hashCode());
        result = prime * result + ubgId;
        result = prime * result + ((ubgName == null) ? 0 : ubgName.hashCode());
        return result;
    }
    
    /**
     * <pre>
     * <一句话功能简述>
     * <功能详细描述>
     * </pre>
     * 
     * @param obj
     * @return
     * @see [类、类#方法、类#成员]
     */
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UbGroupVO other = (UbGroupVO)obj;
        if (ubgDesc == null)
        {
            if (other.ubgDesc != null)
                return false;
        }
        else if (!ubgDesc.equals(other.ubgDesc))
            return false;
        if (ubgId != other.ubgId)
            return false;
        if (ubgName == null)
        {
            if (other.ubgName != null)
                return false;
        }
        else if (!ubgName.equals(other.ubgName))
            return false;
        return true;
    }
    
}
