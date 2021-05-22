package com.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/HelloController")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        //  封装数据
        model.addAttribute("msg","Hello，SrpingMVCAnnotation");
        return "hello";     //会被视图解析器处理
    }
}
