package com.codehunter.secureaccess;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SecureAccessApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext applicationContext = SpringApplication.run(SecureAccessApplication.class);
    }

}
