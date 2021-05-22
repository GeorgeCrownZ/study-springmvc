package com.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/c3")
public class ControllerTest3 {

    @GetMapping(value = "/t1")
    public String test1(Model model) {
        model.addAttribute("msg","/c3/t1");
        return "test";
    }

    //	映射访问路径，必须是POST请求
    @RequestMapping(value = "/hello", method = {RequestMethod.GET})
    public String index2(Model model) {
        model.addAttribute("msg","hello!");
        return "test";
    }
}
