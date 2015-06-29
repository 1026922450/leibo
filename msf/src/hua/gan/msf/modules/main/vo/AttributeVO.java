package hua.gan.msf.modules.main.vo;

import com.wulian.common.jdbc.CcpBaseVO;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 属性VO
 * 
 * <功能详细描述>
 * </pre>
 * 
 * @author xuganhua
 * @version [版本号, 2015-6-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AttributeVO extends CcpBaseVO
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -2294905551391388040L;
    
    /**
     * 属性表表名
     */
    public static final String TABLE_NAME = "xp_attribute";
    
    /**
     * 属性编号
     */
    private int attId;
    
    /**
     * 属性名称
     */
    private String attName;
    
    /**
     * 属性描述
     */
    private String attDesc;
    
    /**
     * 获取 attId
     * 
     * @return 返回 attId
     */
    public int getAttId()
    {
        return attId;
    }
    
    /**
     * 设置 attId
     * 
     * @param 对attId进行赋值
     */
    public void setAttId(int attId)
    {
        this.attId = attId;
    }
    
    /**
     * 获取 attName
     * 
     * @return 返回 attName
     */
    public String getAttName()
    {
        return attName;
    }
    
    /**
     * 设置 attName
     * 
     * @param 对attName进行赋值
     */
    public void setAttName(String attName)
    {
        this.attName = attName;
    }
    
    /**
     * 获取 attDesc
     * 
     * @return 返回 attDesc
     */
    public String getAttDesc()
    {
        return attDesc;
    }
    
    /**
     * 设置 attDesc
     * 
     * @param 对attDesc进行赋值
     */
    public void setAttDesc(String attDesc)
    {
        this.attDesc = attDesc;
    }
    
    @Override
    public String toString()
    {
        return "AttributeVO [attId=" + attId + ", attName=" + attName + ", attDesc=" + attDesc + "]";
    }
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((attDesc == null) ? 0 : attDesc.hashCode());
        result = prime * result + attId;
        result = prime * result + ((attName == null) ? 0 : attName.hashCode());
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
        AttributeVO other = (AttributeVO)obj;
        if (attDesc == null)
        {
            if (other.attDesc != null)
                return false;
        }
        else if (!attDesc.equals(other.attDesc))
            return false;
        if (attId != other.attId)
            return false;
        if (attName == null)
        {
            if (other.attName != null)
                return false;
        }
        else if (!attName.equals(other.attName))
            return false;
        return true;
    }
    
}
