package com.hxx.lessontwo.controller;

import com.hxx.lessontwo.entity.UserEntity;
import com.hxx.lessontwo.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(String username,String password){

        String result="";


        return "登录成功";
    }
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<UserEntity> list() {
        List<UserEntity> all = userJPA.findAll();
        return all;
    }
    @RequestMapping(value = "save", method = RequestMethod.GET)
    public UserEntity save(UserEntity entity){
        return userJPA.save(entity);
    }
    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public List<UserEntity> delete(Long id){
        userJPA.delete(id);
        return userJPA.findAll();
    }
}