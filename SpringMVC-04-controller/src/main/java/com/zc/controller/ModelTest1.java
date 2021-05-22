package com.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*@Controller
public class ModelTest1 {

    @GetMapping(value = "/m1/t1")
    public String test(HttpServletRequest request, HttpServletResponse response) {

        HttpSession session = request.getSession();
        System.out.println(session.getId());

        return "test";
    }

    @GetMapping(value = "/m1/t1")
    public String test1(Model model) {
        //  转发
        return "/index.jsp";
    }

    @GetMapping(value = "/m1/t2")
    public String test2(Model model) {
        //  转发
        model.addAttribute("msg", "ModelTest2");
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @GetMapping(value = "/m1/t3")
    public String test3(Model model) {
        //  重定向
        model.addAttribute("msg", "ModelTest2");
        return "redirect:/index.jsp";
    }

    @GetMapping(value = "/rsm/t1")
    public String test4() {
        //  转发
        return "test";
    }

    @GetMapping(value = "/rsm/t2")
    public String test5() {
        //  重定向
        return "redirect:/index.jsp";
        //  return "redirect:hello.do";     //hello.do为另一个请求
    }
}*/
