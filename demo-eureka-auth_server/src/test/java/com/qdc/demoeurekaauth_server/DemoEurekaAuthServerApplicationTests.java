package com.qdc.demoeurekaauth_server;

import com.alibaba.druid.pool.DruidDataSource;
import com.qdc.demoeurekaauth_server.service.UserService;
import com.qdc.demoeurekaauth_server.service.impl.UserDetailsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootTest
class DemoEurekaAuthServerApplicationTests {

    @Autowired
    private DruidDataSource druidDataSource;

    @Autowired
    private UserService userService;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;


    @Test
    void contextLoads() {
        System.out.println(druidDataSource);
    }

    @Test
    public void test1(){
        System.out.println(userService.getUser("admin"));
        System.out.println(userDetailsService.loadUserByUsername("admin"));
    }

}
