package com.wxx.entity;

/**
 * Created by WXX on 2019/5/14.
 */
public class User {
    private String name;
    private String username;

    @Override
    public String toString () {
        return "User{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", pass='" + pass + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public String getUsername () {
        return username;
    }

    public void setUsername ( String username ) {
        this.username = username;
    }

    private String pass;
    private int age;
    private String sex;
    private String birthday;

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getPass () {
        return pass;
    }

    public void setPass ( String pass ) {
        this.pass = pass;
    }

    public int getAge () {
        return age;
    }

    public void setAge ( int age ) {
        this.age = age;
    }

    public String getSex () {
        return sex;
    }

    public void setSex ( String sex ) {
        this.sex = sex;
    }

    public String getBirthday () {
        return birthday;
    }

    public void setBirthday ( String birthday ) {
        this.birthday = birthday;
    }
}
