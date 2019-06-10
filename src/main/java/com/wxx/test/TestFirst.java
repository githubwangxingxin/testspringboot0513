package com.wxx.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WXX on 2019/5/13.
 */
@Controller
public class TestFirst {
    @RequestMapping("/success")
    public String getSuccess(){
        System.out.println ("第二次更改");
        return "test";
    }
}
