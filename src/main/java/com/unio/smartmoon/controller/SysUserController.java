package com.unio.smartmoon.controller;

import com.unio.smartmoon.model.SysUser;
import com.unio.smartmoon.service.SysUserService;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.unio.smartmoon.utils.response.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.oas.annotations.EnableOpenApi;

@RestController
@RequestMapping(value = "/api/2/user", produces = MediaType.APPLICATION_JSON_VALUE)
@EnableOpenApi
@Api(value = "信息管理", tags="账户管理")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @ApiOperation(value = "查询所有账户列表")
    @GetMapping(value = "/findAll")
    public Object findAll(){
        return Response.success(sysUserService.findAll());
    }

    @ApiOperation(value = "根据ID查询账户列表")
    @GetMapping(value = "/findByID")
    @ApiOperationSupport(author = "xuanyu.li")
    public Object findByID(@RequestParam Long id){
        System.out.println(id);
        return Response.success(sysUserService.findByID(id));
    }

    @ApiOperation(value = "新增用户信息")
    @PostMapping (value = "/insertSysUser")
    @ApiOperationSupport(author = "xuanyu.li")
    public Object insertSysUser(@RequestBody SysUser sysUser){
        System.out.println(sysUser);
        System.out.println("------------------");
        return Response.success(sysUserService.insertSysUser(sysUser));
    }
}
