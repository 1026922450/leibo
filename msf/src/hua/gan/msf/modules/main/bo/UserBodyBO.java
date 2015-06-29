package hua.gan.msf.modules.main.bo;

import com.wulian.common.jdbc.CcpBaseBO;

public class UserBodyBO extends CcpBaseBO
{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 124319897515174843L;
    
    /**
     * 实体编号
     */
    private int ubId;
    
    /**
     * 实体组编号
     */
    private int ubgId;
    
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
        return "UserBodyBO [ubId=" + ubId + ", ubgId=" + ubgId + "]";
    }

    /** 
     * <pre>
     * <一句话功能简述>
     * <功能详细描述>
     * </pre>
     * @return
     * @see [类、类#方法、类#成员]
     */
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ubId;
        result = prime * result + ubgId;
        return result;
    }

    /** 
     * <pre>
     * <一句话功能简述>
     * <功能详细描述>
     * </pre>
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
        UserBodyBO other = (UserBodyBO)obj;
        if (ubId != other.ubId)
            return false;
        if (ubgId != other.ubgId)
            return false;
        return true;
    }
    
    
    
}
