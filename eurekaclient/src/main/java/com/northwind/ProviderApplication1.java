package com.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//服务的提供者
@SpringBootApplication
public class ProviderApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication1.class,args);
    }
}
