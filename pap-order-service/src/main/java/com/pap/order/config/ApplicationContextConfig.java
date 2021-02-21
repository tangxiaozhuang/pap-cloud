package com.pap.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author EiletXie
 * @Since 2020/3/15 17:58
 */
@Configuration
public class ApplicationContextConfig {

    /**
     * LoadBalanced 负载均衡注解
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
