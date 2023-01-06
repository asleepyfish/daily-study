package com.asleepyfish.jpa.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: zhoujh42045
 * @Date: 2022/5/17 19:30
 * @Description: User
 */
@Entity
@Table(name = "j_user", schema = "test")
@Data
public class User {
    /**
     * 标明这是一个主键，自增主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 这是和数据表对应的一个列
     */
    @Basic
    @Column(name = "last_name",length = 50)
    private String lastName;

    /**
     * 默认列名就是属性名
     */
    @Basic
    @Column(name = "email")
    private String email;
}
