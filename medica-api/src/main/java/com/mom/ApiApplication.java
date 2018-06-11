package com.mom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class ApiApplication {
    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}

