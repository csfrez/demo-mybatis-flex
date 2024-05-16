package com.csfrez.flex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.csfrez.flex.dao.mapper")
public class DemoMybatisFlexApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisFlexApplication.class, args);
    }

}
