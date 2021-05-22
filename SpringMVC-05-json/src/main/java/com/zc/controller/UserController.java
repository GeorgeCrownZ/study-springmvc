package com.zc.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zc.pojo.User;
import com.zc.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/j1")
    @ResponseBody   //它就不会走视图解析器,会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        //  创建一个对象
        User user = new User("赵灿",22,"男");

        return JsonUtils.getJson(user);
    }

    @RequestMapping(value = "/j2")
    @ResponseBody   //它就不会走视图解析器,会直接返回一个字符串
    public String json2() throws JsonProcessingException {

        //  创建一个对象
        User user1 = new User("张三",22,"男");
        User user2 = new User("李四",22,"男");
        User user3 = new User("王五",22,"男");
        User user4 = new User("赵六",22,"男");

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        return JsonUtils.getJson(list);
    }

    @RequestMapping(value = "/j3")
    @ResponseBody   //它就不会走视图解析器,会直接返回一个字符串
    public String json3() throws JsonProcessingException {
        return JsonUtils.getJson(new Date());
    }

    @RequestMapping(value = "/j4")
    @ResponseBody   //它就不会走视图解析器,会直接返回一个字符串
    public String json4() throws JsonProcessingException {
        return JsonUtils.getJson(new Date());
    }

    @RequestMapping(value = "/j5")
    @ResponseBody   //它就不会走视图解析器,会直接返回一个字符串
    public String json5(){

        List<User> list = new ArrayList<User>();

        User user1 = new User("张三",22,"男");
        User user2 = new User("李四",22,"男");
        User user3 = new User("王五",22,"男");
        User user4 = new User("赵六",22,"男");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JSON.toJSONString(list);
    }

}
