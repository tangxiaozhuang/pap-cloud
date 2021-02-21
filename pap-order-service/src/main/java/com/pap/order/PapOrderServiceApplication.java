package com.pap.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Autor: thz
 * @Date: 2021/2/21 20:38
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PapOrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PapOrderServiceApplication.class, args);
    }
}
