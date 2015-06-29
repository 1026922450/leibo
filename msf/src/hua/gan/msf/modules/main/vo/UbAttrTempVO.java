package hua.gan.msf.modules.main.vo;

import com.wulian.common.jdbc.CcpBaseVO;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 实体、实体组、模板、属性的关联关系VO
 * 
 * <功能详细描述>
 * </pre>
 * 
 * @author xuganhua
 * @version [版本号, 2015-6-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class UbAttrTempVO extends CcpBaseVO
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -1281872449911910979L;
    
    /**
     * 实体、实体组、模板、属性关联表表名
     */
    public static final String TABLE_NAME = "xp_ub_attr_temp";
    
    /**
     * 编号
     */
    private int ubatId;
    
    /**
     * 实体编号
     */
    private int ubatUbId;
    
    /**
     * 实体名称
     */
    private String ubatUbName;
    
    /**
     * 实体组编号
     */
    private int ubatUbgId;
    
    /**
     * 实体组名称
     */
    private String ubatUbgName;
    
    /**
     * 属性编号
     */
    private int ubatAttId;
    
    /**
     * 属性名称
     */
    private String ubatAttName;
    
    /**
     * 属性值
     */
    private String ubatAttValue;
    
    /**
     * 模板编号
     */
    private int ubatTemId;
    
    /**
     * 模板名称
     */
    private String ubatTemName;
    
    /**
     * 获取 ubatId
     * 
     * @return 返回 ubatId
     */
    public int getUbatId()
    {
        return ubatId;
    }
    
    /**
     * 设置 ubatId
     * 
     * @param 对ubatId进行赋值
     */
    public void setUbatId(int ubatId)
    {
        this.ubatId = ubatId;
    }
    
    /**
     * 获取 ubatUbId
     * 
     * @return 返回 ubatUbId
     */
    public int getUbatUbId()
    {
        return ubatUbId;
    }
    
    /**
     * 设置 ubatUbId
     * 
     * @param 对ubatUbId进行赋值
     */
    public void setUbatUbId(int ubatUbId)
    {
        this.ubatUbId = ubatUbId;
    }
    
    /**
     * 获取 ubatUbName
     * 
     * @return 返回 ubatUbName
     */
    public String getUbatUbName()
    {
        return ubatUbName;
    }
    
    /**
     * 设置 ubatUbName
     * 
     * @param 对ubatUbName进行赋值
     */
    public void setUbatUbName(String ubatUbName)
    {
        this.ubatUbName = ubatUbName;
    }
    
    /**
     * 获取 ubatUbgId
     * 
     * @return 返回 ubatUbgId
     */
    public int getUbatUbgId()
    {
        return ubatUbgId;
    }
    
    /**
     * 设置 ubatUbgId
     * 
     * @param 对ubatUbgId进行赋值
     */
    public void setUbatUbgId(int ubatUbgId)
    {
        this.ubatUbgId = ubatUbgId;
    }
    
    /**
     * 获取 ubatUbgName
     * 
     * @return 返回 ubatUbgName
     */
    public String getUbatUbgName()
    {
        return ubatUbgName;
    }
    
    /**
     * 设置 ubatUbgName
     * 
     * @param 对ubatUbgName进行赋值
     */
    public void setUbatUbgName(String ubatUbgName)
    {
        this.ubatUbgName = ubatUbgName;
    }
    
    /**
     * 获取 ubatAttId
     * 
     * @return 返回 ubatAttId
     */
    public int getUbatAttId()
    {
        return ubatAttId;
    }
    
    /**
     * 设置 ubatAttId
     * 
     * @param 对ubatAttId进行赋值
     */
    public void setUbatAttId(int ubatAttId)
    {
        this.ubatAttId = ubatAttId;
    }
    
    /**
     * 获取 ubatAttName
     * 
     * @return 返回 ubatAttName
     */
    public String getUbatAttName()
    {
        return ubatAttName;
    }
    
    /**
     * 设置 ubatAttName
     * 
     * @param 对ubatAttName进行赋值
     */
    public void setUbatAttName(String ubatAttName)
    {
        this.ubatAttName = ubatAttName;
    }
    
    /**
     * 获取 ubatAttValue
     * 
     * @return 返回 ubatAttValue
     */
    public String getUbatAttValue()
    {
        return ubatAttValue;
    }
    
    /**
     * 设置 ubatAttValue
     * 
     * @param 对ubatAttValue进行赋值
     */
    public void setUbatAttValue(String ubatAttValue)
    {
        this.ubatAttValue = ubatAttValue;
    }
    
    /**
     * 获取 ubatTemId
     * 
     * @return 返回 ubatTemId
     */
    public int getUbatTemId()
    {
        return ubatTemId;
    }
    
    /**
     * 设置 ubatTemId
     * 
     * @param 对ubatTemId进行赋值
     */
    public void setUbatTemId(int ubatTemId)
    {
        this.ubatTemId = ubatTemId;
    }
    
    /**
     * 获取 ubatTemName
     * 
     * @return 返回 ubatTemName
     */
    public String getUbatTemName()
    {
        return ubatTemName;
    }
    
    /**
     * 设置 ubatTemName
     * 
     * @param 对ubatTemName进行赋值
     */
    public void setUbatTemName(String ubatTemName)
    {
        this.ubatTemName = ubatTemName;
    }
    
    @Override
    public String toString()
    {
        return "UbAttrTempVO [ubatId=" + ubatId + ", ubatUbId=" + ubatUbId + ", ubatUbName=" + ubatUbName
            + ", ubatUbgId=" + ubatUbgId + ", ubatUbgName=" + ubatUbgName + ", ubatAttId=" + ubatAttId
            + ", ubatAttName=" + ubatAttName + ", ubatAttValue=" + ubatAttValue + ", ubatTemId=" + ubatTemId
            + ", ubatTemName=" + ubatTemName + "]";
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ubatAttId;
        result = prime * result + ((ubatAttName == null) ? 0 : ubatAttName.hashCode());
        result = prime * result + ((ubatAttValue == null) ? 0 : ubatAttValue.hashCode());
        result = prime * result + ubatId;
        result = prime * result + ubatTemId;
        result = prime * result + ((ubatTemName == null) ? 0 : ubatTemName.hashCode());
        result = prime * result + ubatUbId;
        result = prime * result + ((ubatUbName == null) ? 0 : ubatUbName.hashCode());
        result = prime * result + ubatUbgId;
        result = prime * result + ((ubatUbgName == null) ? 0 : ubatUbgName.hashCode());
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
        UbAttrTempVO other = (UbAttrTempVO)obj;
        if (ubatAttId != other.ubatAttId)
            return false;
        if (ubatAttName == null)
        {
            if (other.ubatAttName != null)
                return false;
        }
        else if (!ubatAttName.equals(other.ubatAttName))
            return false;
        if (ubatAttValue == null)
        {
            if (other.ubatAttValue != null)
                return false;
        }
        else if (!ubatAttValue.equals(other.ubatAttValue))
            return false;
        if (ubatId != other.ubatId)
            return false;
        if (ubatTemId != other.ubatTemId)
            return false;
        if (ubatTemName == null)
        {
            if (other.ubatTemName != null)
                return false;
        }
        else if (!ubatTemName.equals(other.ubatTemName))
            return false;
        if (ubatUbId != other.ubatUbId)
            return false;
        if (ubatUbName == null)
        {
            if (other.ubatUbName != null)
                return false;
        }
        else if (!ubatUbName.equals(other.ubatUbName))
            return false;
        if (ubatUbgId != other.ubatUbgId)
            return false;
        if (ubatUbgName == null)
        {
            if (other.ubatUbgName != null)
                return false;
        }
        else if (!ubatUbgName.equals(other.ubatUbgName))
            return false;
        return true;
    }
    
}
