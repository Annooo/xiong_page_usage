package com.shong.xiong_page_usage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.shong.xiong_page_usage.mapper")
@SpringBootApplication
public class XiongPageUsageApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiongPageUsageApplication.class, args);
    }

}
