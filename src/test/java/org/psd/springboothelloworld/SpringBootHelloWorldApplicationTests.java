package org.psd.springboothelloworld;

import org.junit.jupiter.api.Test;
import org.psd.springboothelloworld.controller.HelloWorldController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootHelloWorldApplicationTests {
    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    void contextLoads() {
        System.out.println(helloWorldController.helloWorld());
    }

}
