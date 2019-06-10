package com.wxx.test;

import com.wxx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by WXX on 2019/5/14.
 */
@RunWith (SpringRunner.class)
@SpringBootTest
public class TestJdbcTemple {
     @Autowired
    UserService userService;
    @Test
    public void insertData(){
        userService.createTable("鸟鹏", "zpcandzhj", 22, "男", new SimpleDateFormat ("yyyy-MM-dd").format(new Date ()).toString());
    }
}
