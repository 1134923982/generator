package com.example.generator.controller;

import com.example.generator.entity.UserDetailEntity;
import com.example.generator.service.UserDetailService;
import com.example.generator.utils.PageMap;
import com.example.generator.utils.PageUtils;
import com.example.generator.utils.Query;
import com.example.generator.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author Liumq
 * Date  2019-10-14
 */
@RestController
@RequestMapping("userdetail")
public class UserDetailController {
    @Autowired
    private UserDetailService userDetailService;

    /**
     * 查看列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("userdetail:list")
    public R list(@RequestBody PageMap pageMap) {
        Map map=new HashMap();
        map.put("page",pageMap.getPage().getPageNum());
        map.put("limit",pageMap.getPage().getPageSize());
        //查询列表数据
        Query query = new Query(map);

        List<UserDetailEntity> userDetailList = userDetailService.queryList(query);
        int total = userDetailService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(userDetailList, total, query.getLimit(), query.getPage());

        return R.ok().put("page", pageUtil);
    }


}
