package bt.project.common.constant;

public class CommonConstant {
    /**
     *  初始密码
     */
    public static final String INIT_PASSWORD = "123456";
    /**
     *  密码超期 90天
     */
    public static final Integer PASSWORD_EXTENDED = 90;

    /**
     * 正常状态
     */
    public static final Integer STATUS_NORMAL = 0;

    /**
     * 禁用状态
     */
    public static final Integer STATUS_DISABLE = -1;

    /**
     * 删除标志
     */
    public static final Integer DEL_FLAG_1 = 1;

    /**
     * 未删除
     */
    public static final Integer DEL_FLAG_0 = 0;

    /**
     * 系统日志类型： 登录
     */
    public static final int LOG_TYPE_1 = 1;

    /**
     * 系统日志类型： 操作
     */
    public static final int LOG_TYPE_2 = 2;


    /** {@code 500 Server Error} (HTTP/1.0 - RFC 1945) */
    public static final Integer SC_INTERNAL_SERVER_ERROR_500 = 500;
    /** {@code 200 OK} (HTTP/1.0 - RFC 1945) */
    public static final Integer SC_OK_200 = 200;

    /**访问权限认证未通过 510*/
    public static final Integer SC_JEECG_NO_AUTHZ=510;

    /** 登录用户拥有角色缓存KEY前缀 */
    public static String LOGIN_USER_CACHERULES_ROLE = "loginUser_cacheRules::Roles_";
    /** 登录用户拥有权限缓存KEY前缀 */
    public static String LOGIN_USER_CACHERULES_PERMISSION  = "loginUser_cacheRules::Permissions_";
    /** 登录用户令牌缓存KEY前缀 */
    public static final int  TOKEN_EXPIRE_TIME  = 3600; //3600秒即是一小时

    public static final String PREFIX_USER_TOKEN  = "PREFIX_USER_TOKEN_";
}
