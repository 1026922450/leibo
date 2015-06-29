package hua.gan.msf.common.constants;

import java.io.File;

/**
 * 
 * <pre>
 * <一句话功能简述>
 * oms的系统常量类
 * <功能详细描述>
 * </pre>
 * 
 * @author  xiongwei
 * @version  [版本号, 2015年5月23日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class OmsConstants
{
    /**根路径*/
    public static String ROOT_PATH = System.getProperty("catalina.home");
    
    /**log日志文件名*/
    public static final String LOG_CONFIG_NAME = "logback.xml";
    
    /** mongodb日志文件名 */
    public static final String MONGODB_CONFIG_NAME = "mongodb.properties";
    
    /** 设置系统上下文路径*/
    public static String SERVER_CONTEXT_PATH = null;
  
    
    /** CONFIG 文件路径*/
    public static String CONFIG_PATH = File.separator + "conf" ;
    
    /** LOG_PATH 日志文件 */
    public static String LOG_PATH = File.separator + "logs" ;

    /** 返回json格式模板 */
    public static final String RPS_MSG_TEMPLATE = "{\"retCode\":\"?\"}";
    
    /** 下划线 字符常量 */
    public static final String CHARACTER_UN_LINE = "_";
    
    /** 空 字符常量 */
    public static final String CHARACTER_EMPTY_STRING = "";
    
    /** 反斜线 字符常量 */
    public static final String CHARACTER_BACK_SLASH = "/";
    
    /** 双斜线 字符常量 */
    public static final String CHARACTER_SLASH = "\\";
    
    /** 竖线 字符常量 */
    public static final String CHARACTER_VERTICAL_SLASH = "|";
    
    /** 封号 字符常量 */
    public static final String CHARACTER_SEMICOLON = ";";
    
    /** 冒号字符常量 */
    public static final String CHARACTER_COLON = ":";
    
    /** 点 字符常量 */
    public static final String CHARACTER_POINT = ".";
    
    /** ? 字符常量 */
    public static final String CHARACTER_INTERROGATION = "?";
}
