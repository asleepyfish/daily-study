package com.asleepyfish.jpa.controller;

import com.asleepyfish.jpa.dao.UserDao;
import com.asleepyfish.jpa.pojo.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: asleepyfish
 * @Date: 2022/5/17 19:48
 * @Description: TODO
 */
@RestController
public class UserController {
    @Resource
    private UserDao userDao;

    @PostMapping("/getUser")
    public User getUser(Integer id){
        return userDao.findById(id).orElse(null);
    }

    @PostMapping("/insertUser")
    public User insertUser(@RequestBody User user) {
        return userDao.save(user);
    }
}
