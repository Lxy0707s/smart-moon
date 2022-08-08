package com.unio.smartmoon.mapper;

import com.unio.smartmoon.model.SysUser;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     *  查询全部
     * @return
     */
    @ApiOperation(value = "账户列表")
    List<SysUser> findAll();
}