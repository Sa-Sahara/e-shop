package com.edu.order_mcrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMcrsApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderMcrsApp.class, args);
    }
}
