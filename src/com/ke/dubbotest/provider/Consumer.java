package com.ke.dubbotest.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 * Created by hdb on 2017/7/14.
 */
public class Consumer {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath:applicationContext-dubbo.xml"
        });
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String name = demoService.sayHello("Tom");
        System.out.println(name);

        List list = demoService.getUser();
        if(null != list && list.size()>0){
            for(int i = 0; i<list.size();i++){
                System.out.println(list.get(i));
            }
        }
            System.in.read();
    }
}
