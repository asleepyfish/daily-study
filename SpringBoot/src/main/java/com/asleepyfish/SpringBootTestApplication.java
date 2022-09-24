package com.asleepyfish;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: asleepyfish
 * @Date: 2022/9/24 15:42
 * @Description: SpringBoot
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.asleepyfish"})
public class SpringBootTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }
}
