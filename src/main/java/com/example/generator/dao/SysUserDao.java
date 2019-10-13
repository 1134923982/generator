package com.example.generator.dao;

import com.example.generator.entity.SysUserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author Liumq
 * Date  2019-05-30
 */
@Repository
public interface SysUserDao {

    SysUserEntity get(String id);

    List<SysUserEntity> findList(SysUserEntity SysUserEntity);

    List<SysUserEntity> findAllList();

    int insert(SysUserEntity SysUserEntity);

    int insertBatch(List<SysUserEntity> SysUserEntitys);

    int update(SysUserEntity SysUserEntity);

    int delete(SysUserEntity SysUserEntity);

}