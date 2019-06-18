package com.hxx.lessontwo.controller;

import com.alibaba.fastjson.JSONObject;
import com.hxx.lessontwo.jpa.UserJPA;
import com.hxx.lessontwo.util.LoggerUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class IndexController {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @Autowired
    private UserJPA userJPA;

private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "login_view", method = RequestMethod.GET)
    public String login_view() {
        logger.info("访问登录页面");
        return "login";
    }


    /**
     * 简单测试请求日志的记录
     * @param request 请求对象
     * @param name 用户名
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public JSONObject login(HttpServletRequest request,String name) throws Exception
    {
        JSONObject obj = new JSONObject();
        obj.put("msg","用户："+name+"，登录成功。");
        //将返回值写入到请求对象中
        request.setAttribute(LoggerUtils.LOGGER_RETURN,obj);
        return obj;
    }
}