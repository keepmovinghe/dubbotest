package com.ke.dubbotest.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hdb on 2017/7/14.
 */
public class Provider {

    public static void main(String[] args){
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml"});
            context.start();

            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
