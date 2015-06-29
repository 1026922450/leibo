Resource = {

	/***************************************************************************
	 * ========================================================================
	 * SYS部分错误码 - 系统管理
	 * ========================================================================
	 */
	/**成功标记*/
    SUCCESS : "操作成功",
		
	/** 用户不存在 */
	ERROR_SYS_USER_NOT_EXISTS : "用户不存在",

	/** 密码错误 */
	ERROR_SYS_PASSWORD : "密码错误",
	
    /**系统内部异常*/
    ERROR_SYS_INTERNAL: "系统内部异常",
    
    /**用户名为空*/
    ERROR_SYS_USERNAME_IS_NULL: "用户名为空",

    /**密码为空*/
    ERROR_SYS_PASSWORD_IS_NULL: "密码为空",
    
    /**角色在数据库已经存在异常*/
    ERROR_SYS_ROLE_IS_EXISTS : "角色在数据库已经存在异常",
    
    /**角色关联用户异常*/
    ERROR_SYS_ROLE_RELATION_USER : "角色关联用户异常",
    
    /**角色名参数非法异常*/
    ERROR_SYS_ROLENAME_ILLEGAL : "角色名参数非法异常",
    
    /**角色编号参数非法异常*/
    ERROR_SYS_ROLE_ID_ILLEGAL : "角色编号参数非法异常",
    
    /**备注参数非法异常*/
    ERROR_SYS_REMARK_ILLEGAL : "备注参数非法异常",
    
    /**菜单地址非法异常*/
    ERROR_SYS_MENU_URL_ILLEGAL : "菜单地址非法异常",
    
    /**菜单名称非法异常*/
    ERROR_SYS_MENU_NAME_ILLEGAL : "菜单名称非法异常",
    
    /**菜单在数据库已经存在异常*/
    ERROR_SYS_MENU_IS_EXISTS : "新增失败，该主菜单已经存在",
    
    /**菜单编号参数非法异常*/
    ERROR_SYS_MENU_ID_ILLEGAL : "菜单编号参数非法异常",
    
    /**菜单已被用户绑定*/
    ERROR_SYS_MENU_USER_IS_EXISTS : "不可删除被用户绑定的菜单",
    
    /** 数据库操作异常 */
    ERROR_DB_EXECUTE_FAIL : "数据库操作异常",
};

top.Resource = Resource;
