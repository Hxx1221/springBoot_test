package com.hxx.lessontwo.controller;

import com.hxx.lessontwo.entity.UserEntity;
import com.hxx.lessontwo.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
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



    @RequestMapping(value = "login_view", method = RequestMethod.GET)
    public String login_view() {
        return "login";
    }
}