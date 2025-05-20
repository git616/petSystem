package com.pet.Test;

import com.pet.common.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello")
public class HelloController {
    @PostMapping("name")
    public String hello(@RequestBody(required = false) User user){
        System.out.println("qqqqqqqqqqqqqq");
        System.out.println("mmmmmmmmmmm");
        System.out.println("分支所做的第一次改变");
        System.out.println("1111111111111111");
        return user.getName();
    }
}
