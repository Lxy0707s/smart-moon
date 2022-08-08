package com.unio.smartmoon.controller;

import com.unio.smartmoon.model.UserInfo;
import com.unio.smartmoon.utils.response.Response;
import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/1/user", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(value = "测试信息管理", tags = {"用户管理"})
public class UserController {
    @GetMapping
    @ApiOperation(value = "分页查询-1")
    public String page(){
        return "测试分页查询";
    }

    @GetMapping("/haha")
    @ApiOperationSupport(author = "xuanyu.li")
    @ApiOperation(value = "分页查询-2")
    public List<UserInfo> getData(){
        List<UserInfo> list = new ArrayList<>();
        list.add(new UserInfo().setName("花花").setSex("男"));
        list.add(new UserInfo().setName("小王").setSex("女"));
        return list;
    }

    @ApiOperation(value = "新增接口-1")
    @ApiOperationSupport(ignoreParameters = {"id","userInfo.id"})
    @PostMapping("/insertMode1l")
    public Object insertModel1(@RequestBody List<UserInfo> uptModel){
        System.out.println(uptModel);
        return Response.success("0");
    }
}
