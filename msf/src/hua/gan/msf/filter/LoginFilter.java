package hua.gan.msf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * <pre>
 * <一句话功能简述>
 * 
 * 校验用户是否登录系统
 * 
 * <功能详细描述>
 * </pre>
 * 
 * @author xuganhua
 * @version [版本号, 2015-6-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter
{
    
    @Override
    public void destroy()
    {
        
    }
    
    @Override
    public void doFilter(ServletRequest paramServletRequest, ServletResponse paramServletResponse,
        FilterChain paramFilterChain)
        throws IOException, ServletException
    {
        paramFilterChain.doFilter(paramServletRequest, paramServletResponse);
    }
    
    @Override
    public void init(FilterConfig paramFilterConfig)
        throws ServletException
    {
        
    }
    
}
