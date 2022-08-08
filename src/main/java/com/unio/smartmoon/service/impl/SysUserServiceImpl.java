package com.unio.smartmoon.service.impl;

import com.unio.smartmoon.mapper.SysUserMapper;
import com.unio.smartmoon.model.SysUser;
import com.unio.smartmoon.service.SysUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    @Override
    public SysUser findByID(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }


    @Override
    public int insertSysUser(SysUser user) {
        return sysUserMapper.insert(user);
    }
}
