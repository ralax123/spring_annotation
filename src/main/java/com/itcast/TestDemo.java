package com.itcast;

import com.itcast.bean.Person;
import com.itcast.service.UserService;
import com.itcast.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.save();
    }

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userserivce =  context.getBean(UserService.class);
        userserivce.save();
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }

}
