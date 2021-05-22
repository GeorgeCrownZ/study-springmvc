package com.zc.controller;

import com.zc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @GetMapping(value = "/t1")
    public String test1(String name, Model model) {
        //  1、接收前端参数
        System.out.println("接收到前端的参数为：" + name);

        //  2、将返回的结果传递给前端
        model.addAttribute("msg", name);

        //  3、视图跳转
        return "test";
    }

    @GetMapping(value = "/t2")
    public String test2(@RequestParam(value = "username") String name, Model model) {
        //  1、接收前端参数
        System.out.println("接收到前端的参数为：" + name);

        //  2、将返回的结果传递给前端
        model.addAttribute("msg", name);

        //  3、视图跳转
        return "test";
    }

    @GetMapping(value = "/t3")
    public String test3(User user) {
        System.out.println(user);
        return "test";
    }
}
