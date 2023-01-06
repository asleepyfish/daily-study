package com.asleepyfish.response.handler;

import com.asleepyfish.response.BaseResponse;
import com.asleepyfish.response.enums.CodeEnum;
import com.asleepyfish.response.exception.BizException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: asleepyfish
 * @Date: 2022/6/16 14:28
 * @Description: TODO
 */
@RestControllerAdvice(annotations = RestController.class)
public class ControllerExceptionHandler {

    @ExceptionHandler(BizException.class)
    public BaseResponse<Void> handler(BizException e) {
        System.out.println("进入业务异常" + e.getRetCode() + e.getRetMessage());
        return BaseResponse.fail(CodeEnum.ERROR.getCode(), CodeEnum.ERROR.getMessage());
    }
}
