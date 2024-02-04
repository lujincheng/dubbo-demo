package com.example.demo.provider;
import org.apache.dubbo.config.annotation.DubboService;

import com.example.demo.DemoService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
