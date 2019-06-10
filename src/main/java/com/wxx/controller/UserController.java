package com.wxx.controller;

import com.mysql.cj.*;
import com.wxx.service.UserServiceMybatis;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static javafx.scene.input.KeyCode.J;

/**
 * Created by WXX on 2019/5/14.
 */
@Controller
public class UserController {
    @Autowired
    UserServiceMybatis userServiceMybatis;

    @RequestMapping("insertTest")
    @ResponseBody
    public String  insertUser(){
        userServiceMybatis.insertUSer ();
        return "成功";
    }
    @RequestMapping("select")
    @ResponseBody
    public String  selectUser(){
        return  userServiceMybatis.selectUser ().toString ();
    }
}
