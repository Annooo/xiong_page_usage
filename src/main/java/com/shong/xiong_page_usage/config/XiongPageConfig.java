package com.shong.xiong_page_usage.config;

import com.shong.xiong_page.plugin.PageInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther 10349 XIONGSY
 * @create 2021/8/3
 */
@Configuration
public class XiongPageConfig {

    @Bean
    public PageInterceptor pageInterceptor(){
        return new PageInterceptor();
    }
}
