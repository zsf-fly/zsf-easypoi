package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qf.mapper"})
public class ZsfEasypoiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZsfEasypoiApplication.class, args);
    }

}
