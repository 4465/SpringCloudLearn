package com.xianfeng.microservice.mapper;

import com.xianfeng.microservice.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from DB_USER where uid = #{uid}")
    User getUserById(int uid);
}
