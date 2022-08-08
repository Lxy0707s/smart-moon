package com.unio.smartmoon.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)// 这个是lombok注解
@ApiModel(value = "UserInfo",description = "用户实体对象")
public class UserInfo {
    @ApiModelProperty(value = "主键id", name = "id")
    private String id;
    @ApiModelProperty(value = "名称",name = "name",example = "小明")
    private String name;
    @ApiModelProperty(value = "性别",name = "sex",example = "男")
    private String sex;
    @ApiModelProperty(value = "邮箱",name = "name",example = "xxx@qq.com")
    private String email;
    @ApiModelProperty(value = "教育信息",name = "educationInfo",example = "贵州大学")
    private EducationInfo educationInfo;
}

@Data
@Accessors(chain = true)// 这个是lombok注解
@ApiModel(value = "EducationInfo",description = "用户教育背景")
class EducationInfo {
    @ApiModelProperty(value = "主键id", name = "id")
    private String id;
    @ApiModelProperty(value = "学校信息",name = "schoolName",example = "贵州大学")
    private String schoolName;
    @ApiModelProperty(value = "学位信息",name = "degree",example = "工学学士")
    private String degree;
    @ApiModelProperty(value = "学历信息",name = "educationBackground",example = "大学本科")
    private String educationBackground;
}