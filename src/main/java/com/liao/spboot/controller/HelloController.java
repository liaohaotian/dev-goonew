package com.liao.spboot.controller;

import com.liao.spboot.common.Log;
import com.liao.spboot.dao.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * 测试控制器
 *
 * @RestController 默认类中方法都以json格式返回
 */
@RestController
public class HelloController {

    /**
     * 获取配置文件的对象
     */
    @Autowired
    StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello() {


        String name = studentProperties.getName();
        String result = "Hello Spring Boot!"+name;

        for(int i = 0;i<100;i++){

            Log.i("Start HelloController =====");
            Log.i("End HelloController =====");
            Log.d("End HelloController =====");
            Log.w("End HelloController =====");
            Log.e("End HelloController =====");
        }

        return result;
    }
}