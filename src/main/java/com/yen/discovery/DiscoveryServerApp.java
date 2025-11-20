package com.yen.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Service Discovery Server cho hệ thống YÊN
 * Quản lý đăng ký và tìm kiếm microservices
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApp {
    
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApp.class, args);
    }
}