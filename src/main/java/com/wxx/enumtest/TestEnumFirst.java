package com.wxx.enumtest;

/**
 * Created by WXX on 2019/5/24.
 */
public class TestEnumFirst {
    public static void main ( String[] args ) {
        for(Human human:Human.values ()){
            System.out.println ("human"+human.toString () );
        }
        Human red=Human.red;
        System.out.println ("red"+red );
    }
}
enum  Human {red,yellow,block}
