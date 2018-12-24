package com.sun.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    public StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String helloMethod(){
        return "hello," + name + "your age is " + age + ";" +content;
    }

    @RequestMapping("hello2")
    public String helloMethod2(){
        StringBuffer sbcontent = new StringBuffer();
            sbcontent.append("name:");
            sbcontent.append(studentProperties.getName());
            sbcontent.append(";");
            sbcontent.append("age:");
            sbcontent.append(studentProperties.getAge());
        return sbcontent.toString();
    }
}
