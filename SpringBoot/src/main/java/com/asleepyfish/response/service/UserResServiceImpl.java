package com.asleepyfish.response.service;

import com.asleepyfish.response.exception.BizException;
import com.asleepyfish.response.pojo.UserParam;
import org.springframework.stereotype.Service;

/**
 * @Author: asleepyfish
 * @Date: 2022/6/16 14:27
 * @Description: TODO
 */
@Service
public class UserResServiceImpl implements UserResService {
    @Override
    public UserParam testUserInfo(UserParam userParam) throws BizException {
        throw new BizException("6666", "测试异常类");
    }
}
