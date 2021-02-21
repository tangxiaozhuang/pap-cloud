package com.pap.payment.controller;

import com.pap.payment.entities.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @Autor: thz
 * @Date: 2021/2/21 20:23
 **/
@RestController
@RefreshScope // 支持Nacos的动态刷新功能
public class GetPaymentConfigController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/payment/getPaymentType")
    public CommonResult getConfigInfo(@RequestParam("name") String name) {
        CommonResult commonResult = new CommonResult<>(200,"successful");
        HashMap map = new HashMap();
        map.put("order_id",name);
        map.put("payment_type",configInfo);
        commonResult.setData(map);
        return commonResult;
    }
}
