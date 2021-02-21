package com.pap.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PapPaymentServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PapPaymentServiceApplication.class, args);
    }
}
