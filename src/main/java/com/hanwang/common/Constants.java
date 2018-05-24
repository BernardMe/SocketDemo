package com.hanwang.common;


/**
  系统常量类
* @ClassName: Constants 
* @Description:
* @author zhaolijuan
* @date 2017年8月22日 下午1:40:49  
*/
public class Constants {

    /**
     * 是否已下发模板：0已下发 1未下发
     */
    public static final Integer  PATROL_IS_ISSUED = 0;
    public static final Integer  PATROL_IS_NOT_ISSUED = 1;

    public static final String EMPLOYEE_INPOSITION = "employeeInPosition";
    /**
     * 数据字典字符串systemLogType
     */
    public static final String LOG_TYPE = "systemLogType";
    /**
     * 字符串"fileName"
     */
    public static final String FILE_NAME = "fileName";
    /**字符串"userId"*/
    public static final String USER_ID = "userId";
    /**字符串"userName"*/
    public static final String USER_NAME = "userName";
    /**字符串"downloadUrl"*/
    public static final String DOWNLOADURL = "downloadUrl";
    /**字符串"failDataExport"*/
    public static final String FAILDATAEXPORT = "failDataExport";
    /**字符串"uploadUrl"*/
    public static final String UPLOADURL = "uploadUrl";
    /**字符串"urlForList"*/
    public static final String URLFORLIST = "urlForList";
    /**
     * 文件上传
     */
    public static final int FILE_SIZE = 1024 * 10;
    
	/**
     * 管理员id
     */
    public static final Integer ADMIN_ID   = 1;
    /**
     * 企业管理员id
     */
    public static final Integer EnterpriseAdmin_ID   = 2;
    /**
     * 登录对应数据字典值
     */
    public static final Integer LOGIN = 1;
    /**
     * 登录对应数据字典值
     */
    public static final Integer LOGOUT = 2;
    public static final Integer LOGCREATE =3; //增加
    public static final Integer LOGEDIT =4; //修改
    public static final Integer LOGDELETE =5; //删除
    public static final Integer LOGEXPORT =6; //导入
    public static final Integer LOGIMPORT =7; //导出
    public static final Integer LOGOTHER =8; //其他
    /**
     * 默认忽略的组织id，-1即不忽略
     */
    public static final int DEFAULT_ID = -1;
    /**
     * 字符串"roleMenu"
     */
    public static final String ROLEMENU = "roleMenu";
    /**
     * 卡片的状态
     */
    public static final Integer CARD_FREEZE = 2;//冻结
    public static final Integer CARD_CANCEL =3; //注销
    public static final Integer CARD_OUTOFDATE =4; //停用
    /**
     * 指标自导入的成功标志：1成功；2失败，导出失败数据；3失败，无需导出失败数据
     */
    public static final Integer CODE_ONE   = 1;
    public static final Integer CODE_TWO   = 2;
    public static final Integer CODE_THREE = 3;

    /**
     * 启禁用状态 ：启用 
     */
    public static final int STATE_ENABLED = 1;
    /** 启禁用状态：禁用 */
    public static final int STATE_DISABLED = 0;
    
	/**
	 * 设备返回结果格式
	 */
	public static final String RETURN_FORMAT = "Return(result=\"success\"";
    
    /**
     * 连接状态 ：正常
     */
    public static final int CON_STATE_ENABLED= 1;
    /** 连接状态 ：异常 */
    public static final int CON_STATE_DISABLED = 0;
    
    /**
     * 状态 ：正常
     */
    public static final int STATE_NORMAL= 1;
    /** 状态 ：异常 */
    public static final int STATE_ABNORMAL = 0;

    /**
     * 出入类型：1入 2出
     */
    public static final int STATE_GET_IN= 1;
    public static final int STATE_GET_OUT= 1;
    
    /**
     * 菜单状态：1正常，0禁用
     */
    public static final int MENU_STATE_ENABLED = 1;
    public static final int MENU_STATE_DISABLED = 0;
    
    /**
     * 不选择菜单
     */
    public static final int MENU_SELECT_NONE= -1;
    
    /**
     * 系统类型
     */
    public static final int SYSTEM_WEB = 1;
    
    /**
     * 菜单级别：0无父级菜单；1:一级；2:二级；3:三级；4四级
     */
    public static final int MENU_LEVEL_ZERO = 0;
    public static final int MENU_LEVEL_FIREST = 1;
    public static final int MENU_LEVEL_SECOND = 2;
    public static final int MENU_LEVEL_THREE = 3;
    public static final int MENU_LEVEL_FOUR = 4;
    
    /**
     *常用异常返回信息 
     */
    public static final String ABNORMAL_OPERATION = "操作异常";
    public static final String ABNORMAL_NETWORK = "网络异常";
    public static final String EXCEPTION_TYPE = "异常信息";
    public static final String SUCCESS_TYPE = "查询成功";
    /**
     * 常用异常提示界面
     */
    public static final String ABNORMAL_NETWORK_VIEW = "error/500";//网络异常提示界面路径
    
    /**
     * 功能状态：1启用；0停用
     */
    public static final int FUNCTION_ENABLED = 1; 
    public static final int FUNCTION_DISABLED = 0;
    
    /**
     * SQL操作结果返回值常量
     * 1成功；0失败
     * -1为数据异常，自定义错误描述
     */
    public static final int SQL_RESULT_SUCCESS = 1;
    public static final int SQL_RESULT_FAILD = 0;
    public static final int SQL_RESULT_ERROR = -1;
    
    /**
     * 文件类型：1-文件，2-目录
     */
    public static final int TYPE_FILE      = 1;
    public static final int TYPE_DIRECTORY = 2;
    
    /**
     * 新增或编辑页面类型：1-新增， 2-编辑
     */
    public static final int SAVE_TYPE  = 1; 
    public static final int EDIT_TYPE  = 2; 
    
    /**
     * 分页大小10
     */
    public static final int PAGE_SIZE  = 10; 
    
    /**
     * 页码首页
     */
    public static final Integer DEFAULT_START_PAGE_INDEX = 1;

    /**
     * 造假
     */
    public static final int STR_DISABLE = 0; 
    
    /**
     * 文件类型：1 word文档；2 文本文档；3 excel表格；4 PPT幻灯片；5 图片
     */
    public static final int FILE_WORD = 1; 
    public static final int FILE_TEXT = 2; 
    public static final int FILE_EXCEL = 3; 
    public static final int FILE_PPT = 4; 
    public static final int FILE_PICTURE = 5; 
    
    /**
     * 文件类型后缀名，doc文件
     */
    public static final String FILE_DOC = "doc"; 
    /** docx文件 */
    public static final String FILE_DOCX = "docx"; 
    /** txt文本文档 */
    public static final String FILE_TXT = "txt"; 
    /** xls表格 */
    public static final String FILE_XLS = "xls"; 
    /** xlsx表格 */
    public static final String FILE_XLSX = "xlsx"; 
    /** jpg图片 */
    public static final String FILE_JPG = "jpg"; 
    /** png图片 */
    public static final String FILE_PNG = "png"; 
    /** bmp图片 */
    public static final String FILE_BMP = "bmp"; 
    
    /**
     * 菜单类型：1菜单；2按钮；
     */
    public static final int MENU_TYPE= 1;   
    public static final int BTN_TYPE= 2;
    
    /**
     * 积分配置类型id,注意与一口清数据字典保持一致
     */
    public static final int POINT_TYPE_SIGN= 10;        //签到    
    public static final int POINT_TYPE_ONE_THING= 11;   //一事一记
    public static final int POINT_TYPE_ONE_THIGN_NO= 15;  //一事一记无图片
    public static final int POINT_TYPE_NOTICE= 13;      //通知
    public static final int POINT_TYPE_TASK= 14;        // 完成任务
    public static final int POINT_TYPE_CADRE= 1;       //村党员干部信息
    public static final int POINT_TYPE_POVERTY= 2;     //扶贫脱贫规划
    public static final int POINT_TYPE_DISTINGUISH= 3; //精准识别情况
    public static final int POINT_TYPE_OUT= 4;         //精准退出情况
    public static final int POINT_TYPE_INPUT= 5;       //信息数据录入
    public static final int POINT_TYPE_INDUSTRY= 6;    //产业扶贫情况
    public static final int POINT_TYPE_CAPITAL= 7;     //扶贫资金使用情况
    public static final int POINT_TYPE_THOUGHT= 8;     //贫困户思想动态
    public static final int POINT_TYPE_STUDY= 23;       //学习资料
    
    /**
     * 资讯类型
     */
    public static final int NEWS_TYPE_MESSAGE = 1;    //消息
    public static final int NEWS_TYPE_DATA = 2;       //资料
    
    /**
     * 资讯栏目id
     */
    public static final int NEWS_COLUMN_NOTICE = 2;       //通知
       
    /**
     * 插入结果：1:信息插入成功 ；0：信息插入失败
     */
    public static final int INSERT_SUCCESS  = 1;   
    public static final int INSERT_FALSE    = 0;  
    
    /**
     * 更新结果：1:信息更新成功； 0：信息更新失败
     */
    public static final int UPDATE_SUCCESS  = 1;   
    public static final int UPDATE_FALSE    = 0;  
    
    /**
     * 删除结果：1:信息删除成功； 0：信息删除失败
     */
    public static final int DELETE_SUCCESS  = 1;  
    public static final int DELETE_FALSE    = 0;   
    
    /**
     * 部门分类：1一级分类；2二级分类
     */
    public static final int ORGCATEGORY_ONE = 1; 
    public static final int ORGCATEGORY_TWO = 2; 
    
    /**
     * 邮件smtp服务器地址
     */
    public static final String EMAIL_ADDRESS = "smtp.exmail.qq.com";	//企业邮箱服务器地址
    
    /**
     * IBMS接口地址
     */
    public static final String IBMS_URL = "http://61.183.204.94:61001/Park/";

    /**
     *地址
     */
    public static final String HOST = "http://sdk.open.api.igexin.com/apiex.htm";
    
    /**
     * 邮箱秘密的des加密key
     */
    public static final String EMAIL_DES_KEY = "email_ipsop";

    /**
     * 性别：男
     */
    public static final int MAN = 1;
    /** 女 */
    public static final int WOMON = 2;
    
    /**
     *用户类型，数据字典中的type
     */
    public static final String DICT_NAME = "userType";
    /**
     * 政治面貌，数据字典中的type
     */
    public static final String DICT_POLITICAL = "politicalStatus";
    /**
     * 领域，数据字典中的额type
     */
    public static final String DICT_EMPLOYEEUSERTO="employeeUseTo";
    /**
     * 学历，数据字典中的type
     */
    public static final String DICT_EDUCATION = "education";
    /**
     *设备类型，数据字典中的deviceType
     */
    public static final String DEVICE_TYPE = "deviceType";

    /**两倍*/
    public static final int NUMBER_TWO = 2;  
    
    /**4K*/
    public static final int NUMBER_FOUR_ZERO_NINE_SIX = 4096;  
    /**一千*/
    public static final int NUMBER_THOUSAND = 1000;  
    /**1K*/
    public static final int NUMBER_ONE_ZERO_TWO_FOUR = 1024;  
    /**10兆*/
    public static final int NUMBER_TEN_M = 1024*10000;  
    /**2兆*/
    public static final int NUMBER_TWE_M = 1024*1024*2;
    
    /**版本号10.0*/
    public static final double VERSION_TEN = 10.0;
    /**版本号9.0*/
    public static final double VERSION_NINE = 9.0; 
    /**版本号8.0*/
    public static final double VERSION_EIGHT= 8.0; 
    /**版本号7.0*/
    public static final double VERSION_SEVEN = 7.0; 
    /**版本号6.0*/
    public static final double VERSION_SIX = 6.0;  
    
    /**时间转换：一天转化为毫秒*/
    public static final int DAY_TO_MILLISECOND = 24 * 1000 * 3600;  
    /**时间转换：一小时转化为毫秒*/
    public static final int HOUR_TO_MILLISECOND = 1000 * 3600;  
    /**时间转换：一分钟转化为毫秒*/
    public static final int MINUTE_TO_MILLISECOND = 1000 * 60;  
    /**时间转换：一秒转化为毫秒*/
    public static final int SECOND_TO_MILLISECOND = 1000 ; 
    /**时间转换：一天转化为小时*/
    public static final int DAY_TO_HOUR = 24 ;  
    /**时间转换：一天转化为分钟*/
    public static final int DAY_TO_MINUTE = 24 * 60;  
    /***时间转换：一天转化为秒*/
    public static final int DAY_TO_SECOND = 24 * 60 * 60 ;  
    /**时间转换：一小时转化为分钟*/
    public static final int HOUR_TO_MINUTE = 60;  
    /**时间转换：一小时转化为秒*/
    public static final int HOUR_TO_SECOND = 3600 ;  
    /**时间转换：一分钟转化为秒*/
    public static final int MINUTE_TO_SECOND = 60 ;  
    
    /**
     *等待应用启动
     */
    public static final int WAIT_START_TWO = 2; 
    
    /**
     *字符串"unknown"
     */
    public static final String STRING_UNKNOWN = "unknown"; 	
    /**操作结果提示："删除目录 "*/
    public static final String STRING_DELETE_DERECTORY = "删除目录 "; 
    /**操作结果提示：" 已存在!"*/
    public static final String STRING_HAS_EXIST = " 已存在!"; 	
    /**操作结果提示：" 不存在!"*/
    public static final String STRING_NO_EXIST = " 不存在!";
    /***操作结果提示："success"*/
    public static final String STRING_SUCCESS = "success";
    /**文件名："fileName"*/
    public static final String STRING_FILENAME = "fileName"; 
    /***字符串"USER-AGENT"*/
    public static final String STRING_USER_AGENT = "USER-AGENT"; 
    
    /***连接超时时间3000毫秒*/
    public static final int CONNECT_TIMEOUT_THREE_THOUSAND = 3000;  
    /***连接超时时间5000毫秒*/
    public static final int CONNECT_TIMEOUT_FIVE_THOUSAND = 5000;  
    
    /**
     *各种时间格式
     */
    public static final String DATE = "yyyy-MM-dd";
    public static final String DATETIME = "yyyy-MM-dd HH:mm:ss";
    public static final String YMD = "yyyyMMdd";
    public static final String YMDHMS = "yyyyMMddHHmmss";
    public static final String DATEHMS = "HH:mm:ss";
    
    /**
     * 异常提示信息
     */
    public static final String MESSAGE = "messege";
    
    /**区域级别
     * 省 */
    public static final Integer PROVICE = 1;
    /**
     * 市 */
    public static final Integer CITY = 2;
    /**
     * 县 */
    public static final Integer COUNTY = 3;
    
    /**
     * 村 */
    public static final Integer VILLAGE = 4;
    
    /**
     * 登录用户
     */
    public static final String USER_LOGIN = "user_login";

	/**
	 * 操作提示："操作失败"<br>
	 */
	public static final String OPERATE_FAIL = "操作失败";
	
	/**
	 * 操作提示："操作成功"<br>
	 */
	public static final String OPERATE_SUCCEED = "操作成功";
    /**
     * 班次正在使用，暂不能操作
     */
    public static final String OPERATE_DISABLE = "班次正在使用，暂不能操作";
	
	/**
	 * 每页大小20<br>
	 */
	public static final int PER_PAGE_SIZE_TWENTY = 20;
	
	/**
	 * 导航页码数<br>
	 */
	public static final int PAGE_SIZE_EIGHT = 8;
	
	/**
	 * 错误状态401<br>
	 */
	public static final int ERROR_STATE_FOUR_ZERO_ONE = 401;
	 /**
     * 判断token是否有效：-4 帐号在其他设备登录；-5 用户授权失效请重新登录
     */
    public static final int TOKEN_CHANGED = -4;  //帐号在其他设备登录
    public static final int TOKEN_EXPIRE  = -5;  //用户授权失效请重新登录

    /**
     * 返回码定义
     */
    public static final int RESULT_CODE_SUCCESS = 0;       //正确码
    public static final int RESULT_PASSWORD_FALSE = -1;    //密码错误
    public static final int RESULT_EXCEPTION_FALSE = -1;   //网络异常
    public static final int RESULT_EXSIT_PHONE_FALSE = -1; //手机号已被注册
    public static final int USER_NOT_EXIST = -1;           //账号不存在
    public static final int PHONE_NOT_EXIST = -1;          //手机不存在
    public static final int USER_FORBID = -1;              //该业主被禁用
    public static final int RESULT_CODE_FALSE = -1;        //数据读取失败
	
    /** 
     * 用户正常状态
     */
    public static final int OWNER_USER_STATE = 1;       //正确码
    
    /** 
     * 部门编码
     */
    public static final int ORGLEVEL_ONE = 1;       //公司 
    public static final int ORGLEVEL_TWO = 2;       //一级部门
    public static final int ORGLEVEL_THREE = 3;       //二级部门
    public static final int ORGLEVEL_LOADER = 4;       //三级部门（虚拟部门）
    public static final String ORG_LOADER = "部门领导";       //部门领导（虚拟部门）

    /**
     *监测级别，数据字典中取
     */
    public static final String MONITORLEVEL = "monitorLevel";
    
    /**
     * 客户端类型
     */
    public static final int APP_USER  = 1;   //用户客户端

    /**
     * 阅读记录类型 1.资讯公告；
     */
    public static final int READ_NEWS = 1;
    
    /**
     * 行政级别
     */
    public static final int LEVEL_CITY    = 1; // 市
    public static final int LEVEL_COUNTY  = 2; // 县
    public static final int LEVEL_TOWN    = 3; // 镇
    public static final int LEVEL_VILLAGE = 4; // 村
    
    /**
     * 操作日志数据字典类型
     */
    public static final String DIC_OPERATE_TYPE = "systemLogType"; //操作日志类型
    public static final String DIC_OPERATE_OBJECT = "systemLogObject";//操作日志对象
    public static final int OPERATE_OBJECT = 1;//员工对象

    /**
     * 审核状态：未审核
     */
    public static final int STATE_NOT_CHECK = 0;
    /**
     * 审核状态：已通过
     */
    public static final int STATE_CHECK_OK = 1;

    /**
     * 申请审核状态:待审核1，审核中2，审核通过3，审核驳回4，已撤销5，已失效6
     */
    public static final Byte APPROVAL_STATUS_STAY = 1;
    public static final Byte APPROVAL_STATUS_IN = 2;
    public static final Byte APPROVAL_STATUS_ADOPT = 3;
    public static final Byte APPROVAL_STATUS_REJECT = 4;
    public static final Byte APPROVAL_STATUS_REVOKE = 5;
    public static final Byte APPROVAL_STATUS_INVALID = 6;

    /**
     * 百度地图获取地址错误地址 人的手机号码
     */
    public static final String BAIDU_MAP_ERROR_PHONE = "13971790740";

    /**
     * 所有部门数据权限
     */
    public static final int ORG_ROLE_ALL = 0;

    /**
     * 统计图类型
     */
    public static final int STATISTICAS_LINE = 1;//折线图
    public static final int STATISTICAS_COLUMN = 2;//柱状图
    
    
    /**
     * 数据显示类型 -降序
     * 
     */
    public static final int SHOW_DATA_DESC = 0;
    
    /**
     * 数据显示类型 -升序
     * 
     */
    public static final int SHOW_DATA_ASC = 1;
    /**
     * 集合的长度
     */
    public static final int LIST_SIZE = 0;
   
    /**
     * 导出标识 导出
     */
    public static final int LOG_EXPORT = 0;
    /**
     * 导出标识 不导出只是折线
     */
    public static final int LOG_EXPORT_NO = 1;
    
    /**
     * 隐藏heightChart导出和公司名称
     */
    public static final Boolean CREDITS_EX_FALSE= false;

	/**
	 *  请求结果状态
	 */
	public static final String REQUEST_SUCCESS = "success";
	public static final String REQUEST_FAIL = "failed";
	public static final String CONNECTION_FAILED = "Connect Failed!";
	/**
	 * @Description:设备编码
	 */
	public static final String DEVICE_CHARSET = "GBK";

	public static final int DEVICE_PORT = 9922;
    

    
    //考勤
    /**
	 * 基本班次存入参数（-1：无 0：前一天1：当天2：第二天）
	 */
	public static final int NO_DAY = -1;
	public static final int LASTDAY = 0;
	public static final int TODAY = 1;
	public static final int SECOND_DAY = 2;
    
	/**
	 * 查询无数据
	 */
	public static final int NO_RECORD = 0; // 无数据
	public static final int HAS_RECORD = 1;// 有数据


    /**
     * 设备类型
     */
    public static final int DEVICE_TYPE_ATTENDANCE   = 1; //考勤机
    public static final int DEVICE_TYPE_DOOR_CONTROL = 3; //门禁控制器
    public static final int DEVICE_TYPE_CONPARISION  = 4; //人证机
    public static final int DEVICE_TYPE_CAMERA = 5; //车禁摄像机
    public static final int DEVICE_TYPE_DISPLAY = 6; //车禁显示器
    public static final int DEVICE_TYPE_ELE_CONTROLLER  = 7; //梯控控制器
    public static final int DEVICE_TYPE_ELE_READER  = 8; //梯控读头
    public static final int CARD_CONSUME = 9;//9消费机
    public static final int DEVICE_TYPE_CARD_READER  = 10; //一卡通读写器
    public static final int DEVICE_TYPE_CARD_AUTHORIZE  = 11; //一卡通授权机


    /**
     * 设备用途：1考勤；2门禁读头；3人证比对；4门禁控制器；5巡更；6车禁; 7梯控；8消费
     */
//    public static final int DEVICE_USE_ATTENDANCE = Menu.MODULE_CODE_ATTENDENCE;
//    public static final int DEVICE_USE_ACCESS     = Menu.MODULE_CODE_ACCESS_CONTROL;
//    public static final int DEVICE_USE_VISITOR    = Menu.MODULE_CODE_VISITOR;
//    public static final int DEVICE_USE_CONTROL    = Menu.MODULE_CODE_ACCESS_CONTROL;
//    public static final int DEVICE_USE_PATROL     = Menu.MODULE_CODE_PATROL;
//    public static final int DEVICE_USE_CAR        = Menu.MODULE_CODE_CAR_BAN;
//    public static final int DEVICE_USE_ELEVATOR   = Menu.MODULE_CODE_ELEVATOR;
//    public static final int DEVICE_USE_CONSUME    = Menu.MODULE_CODE_CONSUMPTION;



    /**
     * 审核状态：1待审核；2审核中；3审核通过；4审核驳回 5已撤销 6已失效
     */
    public static final Byte STATE_WAIT_AUDIT = 1;
    public static final Byte STATE_AUDIT = 2;
    public static final Byte STATE_PASS = 3;
    public static final Byte STATE_REJECT = 4;
    public static final Byte STATE_REPEAL = 5;
    public static final Byte STATE_LOSE_EFFICACY = 6;

    /**
     * 访客人员表的类型：1人员；2登记记录
     */
    public static final Byte TYPE_VISITOR = 1;
    public static final Byte TYPE_REGISTER = 2;

    /**
     * 访客门禁组表中类型：1访客...（扩展用）
     */
    public static final Byte FOR_VISITORS = 1;

    /**
     * 来访状态：1未来访；2登记进入；3手动签离；4自动签离；5已失效
     */
    public static final Byte STATE_NOT_VISIT = 1;
    public static final Byte STATE_LOGIN = 2;
    public static final Byte STATE_LOGOUT = 3;
    public static final Byte STATE_LOGOUT_AUTO = 4;
    public static final Byte STATE_INVALID = 5;

	/**
     * 设备操作指令
     */
    public static final int SYNCHRONICITY_TIME = 1; // 同步设备时间
    public static final int RESTART = 2; // 重启设备
    public static final int GET_INFO = 3; // 获取设备信息
    public static final int GET_RECOND = 4; // 获取考勤记录
    public static final int DELETE_UPLOAD_RECORD = 5; // 删除已上传考勤记录
    public static final int DELETE_PERIOD_RECORD = 6; // 删除某个时间段考勤记录
    public static final int DELETE_RECOND = 7; // 删除考勤机器上的记录
    public static final int GET_PERSON = 8; // 获取考勤机器上的人员
    public static final int DELETE_PERSON_ALL = 9; // 删除考勤机器上所有人员
    public static final int GET_EMPLOYEE = 10; // 获取员工信息
    public static final int DISTRIBUTION_EMPLOYEE = 11; // 下发人员模板
    public static final int DELETE_PERSON_SELECTED = 12; // 删除考勤机器选中人员
    public static final int DELETE_MANAGER = 13; // 删除管理员
    public static final int SET_MANAGER = 14; // 设置管理员

    public static final String MANAGER = "系统管理员";
    public static final String EADMIN = "管理员";

    /**
     * 来访状态：1未执行；2执行成功；3执行失败
     */
    public static final Byte NOT_EXECUTED = 1;
    public static final Byte EXECUTED_SUCCESS = 2;
    public static final Byte EXECUTED_FAILED = 3;
    
    /**
     * 控制器操作指令
     */
    public static final int SYN_DEVICE_TIME = 1; // 同步设备时间
    public static final int REMOTE_OPEN_DOOR = 2; // 远程开门
    public static final int CANCEL_ALARM = 3; // 取消报警
    public static final int SET_TIME_PERIOD = 4; // 设置时间段
    public static final int DISTRIBUTION_CONTROL = 5; // 下发权限
    public static final int SET_DOOR_PARAM = 6; // 设置门参数
    public static final int GET_CONTROL_RECORD = 7; // 获取门禁记录

    /**
     * 车禁摄像机操作指令
     */
    public static final byte SYNC_CAMERA_TIME = 1;//同步设备时间
    public static final byte RESTART_CAMERA = 2;//重启设备


    /**
     * 排班来源类别
     */
    public static final int SCHEDULE_TYPE_ORGN = 1; // 部门排班
    public static final int SCHEDULE_TYPE_PERL = 2; // 个个排班
    public static final int SCHEDULE_TYPE_TRAR = 3; // 个人调班

    /**
     * 审核状态
     */
    public static final int WAIT_FOR_SUBMIT_CHECK = 1; //待提交审核
    public static final int CHECKING = 2; //审核中
    public static final int CHECK_OK = 3; //审核通过
    public static final int CHECK_BACK = 4; //审核驳回

    /**
     * 是否包含子部门：0为否：1为是,-1为未选择
     */
    public static final int IS_INCLUDE_SUBS_YES = 1;
    public static final int IS_INCLUDE_SUBS_NO = 0;
    public static final int IS_INCLUDE_SUBS_YET = -1;

    /**
     * 员工是否在职1：在职0：离职
     */
    public static final int IN_POSITION = 1; // 在职
    public static final int NOT_IN_POSITION = 0; // 离职

    /**
     * 员工在职状态：正式：1 离职：2 试用：3 临时：11 实习：12
     */
    public static final int AT_POSITION = 1;
    public static final int OUT_POSITION = 2;
    public static final int TRIAL_POSITION = 3;
    public static final int TEMPORARY_POSITION = 11;
    public static final int INTERBSHIP_POSITION = 12;

    /**
     * 员工是否删除 1：已删除 0：未删除
     */
    public static final int IS_DELETED = 1; // 已删除
    public static final int NOT_DELETED = 0; // 未删除

    /**
     * 一年最后一天
     */
    public static final String LAST_DAY = "-12-31";

    /**
     * 是否累加工龄：0为否：1为是
     */
    public static final int ACCUMULATE_SENIORITY_YES = 1;
    public static final int ACCUMULATE_SENIORITY_NO = 0;

    /**
     * 计算工龄规则：0为按月：1为按天
     */
    public static final int CALCULATE_BY_DAY = 1;
    public static final int CALCULATE_BY_MONTH = 0;

    /**
     * 一个月
     */
    public static final int ONE_MONTH = 1;
    /**
     * 一月按30天计算
     */
    public static final int MONTH_TO_DAY = 30;
    /**
     * 一年12月
     */
    public static final int YEAR_TO_MONTH = 12;
    /**
     * 0
     */
    public static final int ZERO_DAY = 0;
    
    /**
     * 业务类型 请假 考勤遗漏  加班 访客 调休
     */
    public static final String BUSINESS_TYPE_LEAVE = "1";
    public static final String BUSINESS_TYPE_ATTENDANCE = "2";
    public static final String BUSINESS_TYPE_OVERTIME = "3";
    public static final String BUSINESS_TYPE_VISITOR = "4";
    public static final String BUSINESS_TYPE_OFF = "5";
    public static final String BUSINESS_EVENTDEC_ATTENDANCEOMIT = "考勤遗漏";
    public static final String BUSINESS_EVENTDEC_OVERTIME = "加班";
    public static final String BUSINESS_EVENTDEC_VISITOR = "访客";
    public static final String BUSINESS_EVENTDEC_OFF = "调休";


    /**
     * 短信厂商阿里云
     */
    public static final int ALI_ONE=1;
    
    /**
     * 短信厂商 网易
     */
    public static final int WANGYI_TWO=2;

    /**
     * 通用，是
     */
    public static final int COMMON_YES = 1;

    /**
     * 通用，否
     */
    public static final int COMMON_NO = 0;

    /**
     * for 循环的条件
     */
    public static final int FOR_CONDITION = 50;
    /**
     * 文件类型
     */
    public static final int EXCEL_2003 = 1; //excel2003
    public static final int EXCEL_2007 = 2; //excel2007
    public static final int PDF = 3;//pdf

    /**
     * 员工批量导入共12列
     */
    public static final int ROW_TWO         = 2; //两行
    public static final int COLUMN_ONE      = 1;//第一列
    public static final int COLUMN_TWO      = 2;
    public static final int COLUMN_THREE    = 3;
    public static final int COLUMN_FOUR     = 4;
    public static final int COLUMN_FIVE     = 5;
    public static final int COLUMN_SIX      = 6;
    public static final int COLUMN_SEVEN    = 7;
    public static final int COLUMN_EIGHT    = 8;
    public static final int COLUMN_NINE     = 9;
    public static final int COLUMN_TEN      = 10;
    public static final int COLUMN_ELEVEN   = 11;
    public static final int COLUMN_TWELVE   = 12;
    public static final int COLUMN_THIRTEEN = 13;
    public static final int COLUMN_FOURTEEN = 14;
    public static final int COLUMN_FIFTEEN = 15;
    public static final int COLUMN_SIXTEEN = 16;
    public static final int COLUMN_SEVENTEEN = 17;
    public static final int COLUMN_EIGHTEEN = 18;
    public static final int COLUMN_NINETEEN = 19;
    public static final int COLUMN_TWENTY = 20;
    public static final int COLUMN_TWENTYONE = 21;
    public static final int COLUMN_TWENTYTWO = 22;
    public static final int COLUMN_TWENTYTHERE = 23;
    public static final int COLUMN_TWENTYFOUR = 24;
    public static final int COLUMN_TWENTYFIVE = 25;
    public static final int COLUMN_TWENTYSIX = 26;
    public static final int COLUMN_TWENTYSEVEN  = 27;
    public static final int COLUMN_TWENTYEIGHT = 28;
    /**
     * 是否同步成功：1成功0：失败
     */
    public static final int SYNCHRONIZATION_SUCCESS = 1; // 成功
    public static final int SYNCHRONIZATION_FALSE = 0; // 失败
    /**
     * 批量导入时，提示信息的下一行
     */
    public static final int ANALYSIS_ROW_AFTER_REMARK   = 1;

    /**
     * 考勤编号的最大长度
     */
    public static final int ATTENDANCE_NUM_MAX_LENGTH   = 8;

    /**
     * 员工工号的最大长度
     */
    public static final int EMPLOYEE_NUM_MAX_LENGTH   = 20;

    /**
     * 数据导出列数
     */
    public static final int OUT_COLUMNS = 9;

    /**
     * 导出数据列宽
     */
    public static final int ROW_WIDTH = 15;

    /**
     * 状态 已发布
     */
    public static final Integer PUBLISHED = 2;

    /**
     * 星期
     */
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    /** 用途：通讯录 */
    public static final int USE_TO_ADDRESS      = 1;
    /** 用途：指定代理人 */
    public static final int USE_TO_PROXY_PERSON = 2;

    /** 员工正在被使用 */
    public static final int EMPLOYEE_IN_USE = 1;
    /** 员工没有被使用 */
    public static final int EMPLOYEE_NOT_IN_USE = 0;

    /**
     * 个人排班导入日期起始列
     */
    public static final int PERSONAL_SHCEDULES_IMPORT_INIT    = 3;
    public static final int PERSONAL_SHCEDULES_IMPORT_ABANDON = 3;

    /**
     * 考勤
     */
    public static final int FIELD_EMPLOYEEGROUP = 11;
    /**
     * 巡更
     */
    public static final int FIELD_TEAM= 12;
    /**
     * 门禁
     */
    public static final int FIELD_PERMISSION = 13;

    /**
     * 车禁
     */
    public static final int FIELD_CAR = 15;

    public static final String ATTENDANCE = "考勤";
    public static final String PATROL = "巡更";
    public static final String ACCESS = "门禁";

    /**
     * 时间粒度常量
     */
    public final static int TIME_TYPE_YEAR = 1;
    public final static int TIME_TYPE_MONTH = 2;
    public final static int TIME_TYPE_DAY = 3;

    /**
     * 是
     */
    public static final int STATE_YES = 1;

    /**
     * 否
     */
    public static final int STATE_NO = 0;

    //保留小数的位数
    public static final int TWO_DECIMAL = 2;

    //消费设备关联表--结算类型(1：商品；2：定额；3：按键)
    public static final int STORE = 1;
    public static final int ACCOUNT_FIXED = 2;
    public static final int ACCOUNT_KEYPRESS = 3;

    /*
     * 车禁回调函数缓存存放值
     */
    public static final int NO_RECOGNIZE = 1;//车牌未识别
    public static final int IS_IN_BLACK_LIST = 2;//该车在黑名单中
    public static final int NO_AUTHORIZE = 3;//该车未被该通道授权
    public static final int GET_IMAGE_SUCCESS = 4;//识别正常
    public static final int GET_IMAGE_ERROR = 5;//识别异常

    /**
     * 发卡器错误代码描述 //错误代码
     */
    public static final String PARAMS_ILLEGAL = "参数不合法"; //11
    public static final String CANNOT_USE = "设备不可用"; //-1
    public static final String WHERE_CARD = "无法或未装入目录信息"; //-2
    public static final String READ_CARD_FAIL = "读卡失败"; //-3
    public static final String WRITE_CARD_FAIL = "写卡失败"; //-4

    /**
     * 车禁显示器连接状态
     */
    public static final Integer DISPLAY_CONNECT_SUCCESS = 0;//成功
    public static final Integer DISPLAY_CONNECT_ERROR = 1;//失败
    public static final byte BASIC_CONNECT_SUCCESS = 1;//连接正常
    public static final byte BASIC_CONNECT_ERROR = 0;//连接异常

    /**
     * 车禁显示屏提示语
     */
    public static final String NOT_RECOGNIZE = "未识别";
    public static final String WELCOME = "欢迎光临";
    public static final String SLOW_SPEED = "减速慢行";
    public static final String REST_POT_NUM = "余位:";
    public static final String USER_TEMP_NAME = "临时车";
    public static final String USER_ACCOUNT_NAME = "包期车";
    public static final String OUT_THANKS = "谢谢使用";
    public static final String OUT_SLOW_SPEED = "请慢走";

    /**
     * 车禁显示屏语音提示语
     */
    public static final String VOICE_WELCOME = "欢迎光临，";
    public static final String VOICE_TEMP_NAME = "您是临时用户";
    public static final String VOICE_ACCOUNT_NAME = "您是包期用户";
    public static final String VOICE_THANKS = "谢谢使用，欢迎下次光临";

    /**
     * 车禁参数
     */
    public static final long WAIT_TO_EXCHANGE_TIME = 6000;//车禁显示屏切屏时间,6s
    public static final int REST_NUM = 5;// 车禁车位临界值,只剩5个车位时不再自动放行
    public static final int DEFAULT_CTRL_PULSE_WIDTH = 600;//摄像机默认脉冲宽度
    public static final int DEFAULT_OPT = 1;//摄像机道闸开启参数，固定为1
}
