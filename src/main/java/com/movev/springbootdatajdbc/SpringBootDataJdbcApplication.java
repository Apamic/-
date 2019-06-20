package com.movev.springbootdatajdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.movev.springbootdatajdbc.mapper") //@MapperScan批量扫描所有的Mapper
@SpringBootApplication
public class SpringBootDataJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataJdbcApplication.class, args);
    }
}
