package com.unio.smartmoon.service;

import com.unio.smartmoon.model.SysUser;
import io.swagger.annotations.ApiOperation;

import java.util.List;

public interface SysUserService {
    /**
     * 查询所有
     * @return
     */
    List<SysUser> findAll();

    SysUser findByID(Long id);

    int insertSysUser(SysUser sysUser);
}
