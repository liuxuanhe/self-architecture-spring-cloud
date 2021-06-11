package com.ibm.liuxhe;

import com.ibm.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name="spring-cloud-provider-dept", configuration = MySelfRule.class)
public class DeptConsumerFeignApplication {

  public static void main(String[] args){
    SpringApplication.run(DeptConsumerFeignApplication.class, args);
  }
}
