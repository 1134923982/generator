package com.example.generator.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Author Liumq
 * Date  2019-05-30
 */
public class SysUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private long userId;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private byte status;
    private long createUserId;
    private Timestamp createTime;
    private long deptId;


    public SysUserEntity(){
    }

    public void setUserId (long userId) {this.userId = userId;} 
    public long getUserId(){ return userId;} 
    public void setUsername (String username) {this.username = username;} 
    public String getUsername(){ return username;} 
    public void setPassword (String password) {this.password = password;} 
    public String getPassword(){ return password;} 
    public void setEmail (String email) {this.email = email;} 
    public String getEmail(){ return email;} 
    public void setMobile (String mobile) {this.mobile = mobile;} 
    public String getMobile(){ return mobile;} 
    public void setStatus (byte status) {this.status = status;} 
    public byte isStatus(){ return status;} 
    public void setCreateUserId (long createUserId) {this.createUserId = createUserId;} 
    public long getCreateUserId(){ return createUserId;} 
    public void setCreateTime (Timestamp createTime) {this.createTime = createTime;} 
    public Timestamp getCreateTime(){ return createTime;} 
    public void setDeptId (long deptId) {this.deptId = deptId;} 
    public long getDeptId(){ return deptId;} 

}