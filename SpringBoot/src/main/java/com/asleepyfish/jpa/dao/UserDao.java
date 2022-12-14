package com.asleepyfish.jpa.dao;

import com.asleepyfish.jpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: asleepyfish
 * @Date: 2022/5/17 19:36
 * @Description: TODO
 */
@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
