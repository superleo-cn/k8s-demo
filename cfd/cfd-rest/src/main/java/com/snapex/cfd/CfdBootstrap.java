package com.snapex.cfd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CfdBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(CfdBootstrap.class, args);
    }

}
