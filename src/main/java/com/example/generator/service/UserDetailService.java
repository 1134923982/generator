package com.example.generator.service;

import com.example.generator.entity.UserDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * Author Liumq
 * Date  2019-10-14
 */
public interface UserDetailService {

    /**
     * 分页查询
     *
     * @param map 参数
     * @return list
     */
    List<UserDetailEntity> queryList(Map<String, Object> map);

    /**
    * 分页统计总数
    *
    * @param map 参数
    * @return 总数
    */
    int queryTotal(Map<String, Object> map);

}
