package com.example.generator.service.impl;

import com.example.generator.dao.SysUserDao;
import com.example.generator.entity.SysUserEntity;
import com.example.generator.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author Liumq
 * Date  2019-05-30
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;
    
    @Override
    public SysUserEntity get(String id){
        return sysUserDao.get(id);
    }
    
    @Override
    public List<SysUserEntity> findList(SysUserEntity sysUser) {
        return sysUserDao.findList(sysUser);
    }
    
    @Override
    public List<SysUserEntity> findAllList() {
        return sysUserDao.findAllList();
    }
    
    @Override
    public int insert(SysUserEntity sysUser) {
        return sysUserDao.insert(sysUser);
    }
    
    @Override
    public int insertBatch(List<SysUserEntity> sysUsers){
        return sysUserDao.insertBatch(sysUsers);
    }
    
    @Override
    public int update(SysUserEntity sysUser) {
        return sysUserDao.update(sysUser);
    }
    
    @Override
    public int delete(SysUserEntity sysUser) {
        return sysUserDao.delete(sysUser);
    }

}
