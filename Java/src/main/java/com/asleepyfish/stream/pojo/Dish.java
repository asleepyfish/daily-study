package com.asleepyfish.stream.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: asleepyfish
 * @Date: 2022/6/14 17:14
 * @Description: TODO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
}
