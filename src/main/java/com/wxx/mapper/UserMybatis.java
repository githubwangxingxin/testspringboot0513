package com.wxx.mapper;

import com.wxx.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by WXX on 2019/5/14.
 */
@Repository
public interface UserMybatis {
    @Insert ( "insert into tb_user(name,pass,age,sex,birthday) values(#{name},#{pass},#{age},#{sex},#{birthday})")
    int insertUser( @Param ( "name" ) String name,  @Param ( "pass" ) String pass, @Param ( "age" ) int age, @Param ( "sex" ) String sex, @Param ( "birthday" ) String birthday);

    @Select ( "select * from tb_user where name=#{name}" )
    @Results({
            @Result(column = "name",property="username",jdbcType = JdbcType.VARCHAR)
    })
    User getUser(@Param ( "name" ) String name);

    List<User> getListUser();
}
