package com.asleepyfish.interceptors.controller;

import com.asleepyfish.interceptors.pojo.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: asleepyfish
 * @Date: 2022/5/17 16:26
 * @Description: LoginInterceptorController
 */
@RestController
@RequestMapping("/person")
public class LoginInterceptorController {
    /**
     * 用户登录
     *
     * @param request
     * @return
     */
    @RequestMapping("/login")
    public Object login(HttpServletRequest request) {
        // 将已经登录的用户信息添加到session中
        request.getSession().setAttribute("person", new Person(1, "root", "root"));
        return "Login Success";
    }

    /**
     * 不需要登录也能访问的请求
     *
     * @return
     */
    @RequestMapping("/noLogin")
    public Object noLg() {
        return "Everyone Can See";
    }

    /**
     * 必须要登录才能访问的请求
     *
     * @return
     */
    @RequestMapping("/mustLogin")
    public Object mustLg() {
        return "Only User Can See";
    }

    /**
     * 如果用户未登录访问了需要登录才能访问的请求会跳转到这个错误提示页面
     *
     * @return
     */
    @RequestMapping("/error")
    public Object error() {
        return "You Must Login";
    }
}
