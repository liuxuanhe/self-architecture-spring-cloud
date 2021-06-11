package com.ibm.liuxhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@EnableEurekaClient //本服务启动后，会自动注册到Eureka
@SpringBootApplication
public class DeptProviderHystrixApplication {

  public static void main(String[] args){
    SpringApplication.run(DeptProviderHystrixApplication.class, args);
  }
}
