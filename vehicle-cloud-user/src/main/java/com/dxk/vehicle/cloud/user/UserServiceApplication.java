package com.dxk.vehicle.cloud.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName : UserServiceApplication
 * @Description : 客户服务启动类
 * @Author : DingXK
 * @Date: 2020-08-15 18:57
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.dxk.vehicle.cloud.user.dao"})
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
    }
}
