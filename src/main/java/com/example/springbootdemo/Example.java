package com.example.springbootdemo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController。这被称为 stereotype annotation。它为阅读代码的人提供了线索，对于Spring来说，这个类扮演着特定的角色。在这种情况下，我们的类是一个Web @Controller，所以Spring在处理传入的Web请求时会考虑这个类。
@RestController
//第二个级别注释是@EnableAutoConfiguration。这个注解告诉Spring Boot根据你添加的jar依赖来“猜测”你想要如何配置Spring。自从spring-boot-starter-web添加了Tomcat和Spring MVC之后，自动配置假定您正在开发一个Web应用程序并据此设置Spring。
@EnableAutoConfiguration
public class Example {

    //@RequestMapping注释提供“路由”的信息。它告诉Spring，任何带有/路径的HTTP请求都应映射到该home方法。
    // 该 @RestController注释告诉Spring将结果字符串直接呈现给调用者。
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
