package com.zhoulianchang.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zlc
 * @date 2019-06-05 20:42
 */
@SpringBootApplication
@MapperScan("com.zhoulianchang.mybatis.mapper")
public class MyBatisApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class, args);
    }
}
