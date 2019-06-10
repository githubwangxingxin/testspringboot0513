package com.wxx.serviceimp;

import com.wxx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by WXX on 2019/5/14.
 */
@Service
public class UserServiceImple implements UserService{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void createTable ( String name, String pass, Integer age, String sex, String birthday ) {
    jdbcTemplate.update ( "insert into tb_user(name,pass,age,sex,birthday) values(?,?,?,?,?);", name, pass, age, sex,birthday);
    }
}
