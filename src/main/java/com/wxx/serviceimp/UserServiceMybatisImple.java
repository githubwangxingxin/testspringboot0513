package com.wxx.serviceimp;

import com.wxx.entity.User;
import com.wxx.mapper.UserMybatis;
import com.wxx.service.UserServiceMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by WXX on 2019/5/14.
 */
@Service
public class UserServiceMybatisImple implements UserServiceMybatis {
    @Autowired
    private UserMybatis userMybatis;
    @Override
    public int insertUSer () {
        return userMybatis.insertUser ( "wxx","123456",12,"男","2018" );
    }

    @Override
    public User selectUser () {
        return userMybatis.getUser ( "wxx" );
    }

}
