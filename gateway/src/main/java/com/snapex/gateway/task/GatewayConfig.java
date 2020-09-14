package com.snapex.gateway.task;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @program: k8s-demo
 * @description:
 * @author: kylin
 * @create: 2020-09-15 00:07
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "pool.size")
public class GatewayConfig {

    private Integer core;

    private Integer max;

}
