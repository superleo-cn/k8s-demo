package com.snapex.gateway.task;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: k8s-demo
 * @description:
 * @author: kylin
 * @create: 2020-09-15 00:04
 **/
@RequiredArgsConstructor
@Component
public class ScheduleTask {

    @Value("${pool.size.core}")
    private Integer core;

    private final GatewayConfig config;

    @Scheduled(fixedDelay = 5000)
    public void schedule() {
        System.out.println("@Value: the size of core is: " + core);
        System.out.println("Config the size of core is: " + config.getCore());
    }
}
