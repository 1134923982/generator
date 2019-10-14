package com.example.generator.service.impl;

import com.example.generator.dao.UserDetailDao;
import com.example.generator.entity.UserDetailEntity;
import com.example.generator.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author Liumq
 * Date  2019-10-14
 */
@Service
public class UserDetailServiceImpl implements UserDetailService {
    @Autowired
    private UserDetailDao userDetailDao;

    @Override
    public List<UserDetailEntity> queryList(Map<String, Object> map) {
         return userDetailDao.queryList(map);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
         return userDetailDao.queryTotal(map);
    }

}
