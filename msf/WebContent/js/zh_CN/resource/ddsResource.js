Resource = {

	/***************************************************************************
	 * ========================================================================
	 * DDS部分错误码 - 国家管理
	 * ========================================================================
	 */
	/**成功标记*/
    SUCCESS : "操作成功",
    
    /** 系统内部异常 */
    ERROR_DDS_INTERNAL:"系统内部异常",
    
    /** 国家ID在数据库已存在 */
    ERROR_DDS_COUNTRY_ID_EXISTS:"国家编号在数据库已存在异常",
    
    /** 国家名称已存在 */
    ERROR_DDS_COUNTRY_NAME_EXISTS:"国家名称在数据库已存在异常",
    
    /** 国家与省份之间存在关联,不能删除 */
    ERROR_DDS_COUNTRY_RELATION_PROVINCE:"国家关联省份异常",
    
    /** 国家编号长度不合法 */
    ERROR_DDS_COUNTRYID_ILLEGAL:"国家编号参数非法异常",
    
    /** 国家名称不合法 */
    ERROR_DDS_COUNTRY_NAME_ILLRGAL:"国家名称参数非法异常",
    
    /** 国家ID非法 */
    ERROR_DDS_COUNTRY_ID_ILLEGAL:"国家ID非法异常",
    
    /** 数据库操作异常 */
    ERROR_DB_EXECUTE_FAIL : "数据库操作异常",
};

top.Resource = Resource;