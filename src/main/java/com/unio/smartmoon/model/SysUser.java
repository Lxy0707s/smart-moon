package com.unio.smartmoon.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "SysUser",description = "用户实体对象")
public class SysUser {
    @ApiModelProperty(value = "主键id", name = "id")
    private Long id;

    @ApiModelProperty(value = "name", name = "name")
    private String name;

    @ApiModelProperty(value = "nickName", name = "nickName")
    private String nickName;

    @ApiModelProperty(value = "avater", name = "avater")
    private String avater;

    @ApiModelProperty(value = "salt", name = "salt")
    private String salt;

    @ApiModelProperty(value = "password", name = "password")
    private String password;

    @ApiModelProperty(value = "email", name = "email")
    private String email;

    @ApiModelProperty(value = "mobile", name = "mobile")
    private String mobile;

    @ApiModelProperty(value = "status", name = "status")
    private Byte status;

    @ApiModelProperty(value = "deptId", name = "deptId")
    private Long deptId;

    @ApiModelProperty(value = "delFlag", name = "delFlag")
    private Byte delFlag;

    @ApiModelProperty(value = "createTime", name = "createTime")
    private Date createTime;

    @ApiModelProperty(value = "createBy", name = "createBy")
    private String createBy;

    @ApiModelProperty(value = "lastUpdateBy", name = "lastUpdateBy")
    private String lastUpdateBy;

    @ApiModelProperty(value = "lastUpdateTime", name = "lastUpdateTime")
    private Date lastUpdateTime;

    public SysUser(Long id, String name, String nickName, String avater, String salt, String password, String email, String mobile, Byte status, Long deptId, Byte delFlag, Date createTime, String createBy, String lastUpdateBy, Date lastUpdateTime) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.avater = avater;
        this.salt = salt;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.deptId = deptId;
        this.delFlag = delFlag;
        this.createTime = createTime;
        this.createBy = createBy;
        this.lastUpdateBy = lastUpdateBy;
        this.lastUpdateTime = lastUpdateTime;
    }

    public SysUser() {
        super();
    }

    public SysUser sysUser() {
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getAvater() {
        return avater;
    }

    public void setAvater(String avater) {
        this.avater = avater == null ? null : avater.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Byte getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}