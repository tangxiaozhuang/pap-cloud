package com.pap.order.controller;

import com.pap.order.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @Autor: thz
 * @Date: 2021/2/21 20:43
 * 获取订单支付信息demo
 **/
@RestController
@Slf4j
//@RequestMapping("/order")
public class GetOrderPaymentTypeController {
    @Resource
    private RestTemplate restTemplate;
    // 获取 payment 服务的地址
    @Value("${service-url.payment}")
    private String paymentServiceURL;

    /**
     * 根据订单名称，调用支付模块获取支付类型 demo
      * @param name
     * @return
     */
    @GetMapping(value = "/order/getPaymentType")
    public CommonResult<HashMap> paymentInfo(@RequestParam("name") String name) {
        log.info("服务调用："+paymentServiceURL);
        return restTemplate.getForObject(paymentServiceURL + "/payment/getPaymentType?name=" + name, CommonResult.class);
    }

    /**
     * 根据订单名称，调用支付模块获取支付类型 demo
     * @param
     * @return
     */
    @GetMapping(value = "/order/getId")
    public String paymentInfo() {
        log.info("111111111");
        return "id=111";
    }
}
