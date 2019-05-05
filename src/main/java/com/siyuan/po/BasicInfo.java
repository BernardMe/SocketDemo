package com.siyuan.po;

import java.util.Date;

public class BasicDevice {

    /**
     * 主键
     * 对应字段 : ID
     */
    private Integer id;

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
     * 最近联机时间
     * 对应字段 : CONNECTION_TIME
     */
    private Date connectionTime;

    /**
     * 是否停用：1： 正常 0：停用
     * 对应字段 : IS_USED
     */
    private Byte isUsed;
}