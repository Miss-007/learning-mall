package com.huang.mall.practice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MybatisConfig配置类
 */
@Configuration
@MapperScan("com.huang.mall.practice.mbg.mapper")
public class MyBatisConfig {
}
