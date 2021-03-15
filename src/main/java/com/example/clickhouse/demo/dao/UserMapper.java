package com.example.clickhouse.demo.dao;

import com.example.clickhouse.demo.po.UserPo;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    UserPo getUser(@Param("id") Integer id);
}
