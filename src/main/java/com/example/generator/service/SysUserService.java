package com.example.generator.service;


import com.example.generator.entity.SysUserEntity;

import java.util.List;

/**
 * Author Liumq
 * Date  2019-05-30
 */
public interface SysUserService {

    SysUserEntity get(String id);

    List<SysUserEntity> findList(SysUserEntity sysUser);

    List<SysUserEntity> findAllList();

    int insert(SysUserEntity sysUser);

    int insertBatch(List<SysUserEntity> sysUsers);

    int update(SysUserEntity sysUser);

    int delete(SysUserEntity sysUser);

}
