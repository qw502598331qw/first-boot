package com.example.first;

import exception.BusinessException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${agan.msg}")
    private String msg;
    @RequestMapping("")
    public String index() {
//        int no =1/0;
//        throw new BusinessException("100","账号或密码错误")；
        return this.msg;
    }
}
