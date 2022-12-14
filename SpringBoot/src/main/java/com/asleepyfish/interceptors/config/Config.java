package com.asleepyfish.interceptors.config;

import com.asleepyfish.interceptors.filter.MyFilter;
import com.asleepyfish.interceptors.listener.MyListener;
import com.asleepyfish.interceptors.servlet.MyServlet;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import java.util.Arrays;

/**
 * @Author: asleepyfish
 * @Date: 2022/5/17 17:12
 * @Description: servlet、filter、listener配置类
 */
@Configuration
public class Config {
    /**
     * 注册servlet组件
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean<Servlet> myServlet() {
        ServletRegistrationBean<Servlet> registrationBean = new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
        // 设置启动顺序
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }

    /**
     * 配置嵌入式的Servlet容器
     * 一定要将这个定制器加入到容器中
     *
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactory() {
        // 定制嵌入式的Servlet容器相关的规则
        return factory -> factory.setPort(8080);
    }

    /**
     * 注册filter组件
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean<Filter> myFilter() {
        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
        // 设置filter
        filterRegistrationBean.setFilter(new MyFilter());
        // 设置拦截uri的路径
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello", "/myServlet"));
        return filterRegistrationBean;
    }

    /**
     * 注册Listener
     *
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean<MyListener> myListener() {
        return new ServletListenerRegistrationBean<>(new MyListener());
    }


}
