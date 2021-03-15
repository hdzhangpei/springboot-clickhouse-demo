package com.example.clickhouse.demo.controller;

import com.example.clickhouse.demo.dao.UserMapper;
import com.example.clickhouse.demo.po.UserPo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(description = "测试clickhouse")
public class TestController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ApiOperation(value = "获取用户名", notes = "获取用户名")
    public UserPo get(Integer id){
        System.out.println(id);
        UserPo userPo = userMapper.getUser(id);
        System.out.println(userPo);
        return userPo;
    }
}
