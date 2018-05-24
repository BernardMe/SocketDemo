package t19.performance.model;

import java.util.Date;

public class BasicInfo {
    public static Object set;
    /**
     * 主键
     * 对应字段 : ID
     */
    private Integer id;

    /**
     * 安装区域ID
     * 对应字段 : LOCATION_ID
     */
    private Integer locationId;

    /**
     * 设备名称
     * 对应字段 : NAME
     */
    private String name;

    /**
     * 设备SN编号
     * 对应字段 : SN_CODE
     */
    private String snCode;

    /**
     * 最新修改设备信息时间
     * 对应字段 : UPDATE_TIME
     */
    private Date updateTime;

    /**
     * 最近联机时间
     * 对应字段 : CONNECTION_TIME
     */
    private Date connectionTime;

    /**
     * 是否停用：1： 正常 0：停用
     * 对应字段 : IS_USED
     */
    private Byte isUsed;

    /**
     * 固件版本号
     * 对应字段 : FIRMWARE
     */
    private String firmware;

    /**
     * 设备类型（数据字典：1考勤机、2门禁读头、3控制器、4人证机考勤门禁一体机,5摄像机，6，显示器等）
     * 对应字段 : DEVICE_TYPE
     */
    private Byte deviceType;

    /**
     * 连接状态（0异常，1正常）
     * 对应字段 : CONNECTION_STATE
     */
    private Byte connectionState;

    /**
     * IP地址
     * 对应字段 : IP_ADDRESS
     */
    private String ipAddress;

    /**
     * 通信端口
     * 对应字段 : PORT
     */
    private String port;

    /**
     * 通信密码
     * 对应字段 : PWD
     */
    private String pwd;

    /**
     * 已用用户容量
     * 对应字段 : USED_AMOUNT
     */
    private Integer usedAmount;

    /**
     * 用户总容量
     * 对应字段 : TOTAL_AMOUNT
     */
    private Integer totalAmount;

    /**
     * 已用记录容量
     * 对应字段 : USED_RECORD_AMOUNT
     */
    private Integer usedRecordAmount;

    /**
     * 记录总容量
     * 对应字段 : TOTAL_RECORD_AMOUNT
     */
    private Integer totalRecordAmount;

    /**
     * 用户容量警告（0异常，1正常）
     * 对应字段 : IS_USED_NORMAL
     */
    private Byte isUsedNormal;

    /**
     * 记录总容量警告（0异常，1正常）
     * 对应字段 : IS_RECORD_NORMAL
     */
    private Byte isRecordNormal;

    /**
     * MAC地址
     * 对应字段 : MAC_ADDRESS
     */
    private String macAddress;

    /**
     * 备注
     * 对应字段 : MEMO
     */
    private String memo;

    /**
     * 所属部门
     * 对应字段 : DEPARTMENT_ID
     */
    private Integer departmentId;

    /**
     * 厂家
     * 对应字段 : FACTORY
     */
    private String factory;

    /**
     * 型号
     * 对应字段 : TYPE
     */
    private String type;

    /**
     * 用途——数据字典
     * 对应字段 : USE_FOR
     */
    private String useFor;

    /**
     * 企业域id
     * 对应字段 : DOMAIN_ID
     */
    private Integer domainId;

    /**
     * 安装位置
     * 对应字段 : POSITION
     */
    private String position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSnCode() {
        return snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode == null ? null : snCode.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }

    public Byte getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Byte isUsed) {
        this.isUsed = isUsed;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware == null ? null : firmware.trim();
    }

    public Byte getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Byte deviceType) {
        this.deviceType = deviceType;
    }

    public Byte getConnectionState() {
        return connectionState;
    }

    public void setConnectionState(Byte connectionState) {
        this.connectionState = connectionState;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Integer getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(Integer usedAmount) {
        this.usedAmount = usedAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getUsedRecordAmount() {
        return usedRecordAmount;
    }

    public void setUsedRecordAmount(Integer usedRecordAmount) {
        this.usedRecordAmount = usedRecordAmount;
    }

    public Integer getTotalRecordAmount() {
        return totalRecordAmount;
    }

    public void setTotalRecordAmount(Integer totalRecordAmount) {
        this.totalRecordAmount = totalRecordAmount;
    }

    public Byte getIsUsedNormal() {
        return isUsedNormal;
    }

    public void setIsUsedNormal(Byte isUsedNormal) {
        this.isUsedNormal = isUsedNormal;
    }

    public Byte getIsRecordNormal() {
        return isRecordNormal;
    }

    public void setIsRecordNormal(Byte isRecordNormal) {
        this.isRecordNormal = isRecordNormal;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUseFor() {
        return useFor;
    }

    public void setUseFor(String useFor) {
        this.useFor = useFor == null ? null : useFor.trim();
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}