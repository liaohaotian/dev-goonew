package com.liao.spboot.demo.service;


import com.liao.spboot.dao.User;
import com.liao.spboot.service.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testUserSave() throws  Exception{


        System.out.println("Test start-----");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);


        userRepository.save(new User("liming333","password","lm3333@qq.com","L33333i",formattedDate));


        userRepository.save(new User("liming2","password","lm222@qq.com","Li222",formattedDate));
        System.out.println("Test end-----");




    }


    @Test
    public void testUserFind() {



        User user1 = userRepository.findByUserName("liming2");
        System.out.println(user1.toString());



        userRepository.findAll();

        User user2 = userRepository.findByUserNameOrEmail("liming333","lm22aaaa2@qq.com");
        System.out.println(user2.toString());

    }





}
