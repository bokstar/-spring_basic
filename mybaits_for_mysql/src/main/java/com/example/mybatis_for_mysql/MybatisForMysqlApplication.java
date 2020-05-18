package com.example.mybatis_for_mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatis_for_mysql.mapper")
public class MybatisForMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisForMysqlApplication.class, args);
    }

}
