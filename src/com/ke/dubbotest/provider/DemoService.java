package com.ke.dubbotest.provider;

import java.util.List;

/**
 * Created by hdb on 2017/7/14.
 */
public interface DemoService {
    String sayHello(String name);

    public List getUser();
}
