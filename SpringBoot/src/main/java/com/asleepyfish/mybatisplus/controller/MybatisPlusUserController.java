package com.asleepyfish.mybatisplus.controller;

import com.asleepyfish.mybatisplus.mapper.UserMapper;
import com.asleepyfish.mybatisplus.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: asleepyfish
 * @Date: 2022/5/18 10:22
 * @Description: TODO
 */
@RestController
@RequestMapping("/mybatisPlus")
public class MybatisPlusUserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/insertUser")
    public Integer insertUser(@RequestBody User user) {
        return userMapper.insert(user);
    }

    @RequestMapping("/updateUser")
    public Integer updateUser(@RequestBody User user) {
        return userMapper.updateById(user);
    }
}
