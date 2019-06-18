package com.hxx.lessontwo.controller;

import com.hxx.lessontwo.entity.UserEntity;
import com.hxx.lessontwo.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    //@RequestMapping(value = "login", method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @RequestMapping(value = "logins", method = RequestMethod.GET)
    public String login(UserEntity user, HttpServletRequest request) {

        UserEntity nameuser = userJPA.findOne(new Specification<UserEntity>() {
            @Override
            public Predicate toPredicate(Root<UserEntity> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                Predicate nameuser1 = criteriaBuilder.equal(root.get("username"), user.getUsername());

                return null;
            }
        });

        if (nameuser == null) {

            return "用户不存在";

        } else if (!nameuser.getPassword().equals(user.getPassword())) {

            return "密码不正确";

        }

        request.getSession().setAttribute("_session_user", nameuser);

        return "登录成功";
    }


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<UserEntity> list() {
        List<UserEntity> all = userJPA.findAll();
        return all;
    }

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public UserEntity save(UserEntity entity) {
        return userJPA.save(entity);
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public List<UserEntity> delete(Long id) {
        userJPA.delete(id);
        return userJPA.findAll();
    }
}