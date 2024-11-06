package org.psd.springboothelloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一个简单的SpringBootHelloWorld项目
 *
 * @author pengshidun
 */
@RestController
@RequestMapping("/helloWorld")
public class HelloWorldController {
    /**
     * 返回helloWorld字符串
     *
     * @return helloWorld字符串
     */
    @GetMapping
    public String helloWorld() {
        return "helloWorld";
    }
}