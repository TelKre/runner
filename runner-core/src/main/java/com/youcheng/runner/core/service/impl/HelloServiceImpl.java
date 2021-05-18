package com.youcheng.runner.core.service.impl;

import com.youcheng.runner.core.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String say(String name) {
        return "Hello, " + name;
    }

    @Override
    public String say2(){
        return null;
    }
}

