package com.ibm.liuxhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //本服务启动后，会自动注册到Eureka
@SpringBootApplication
public class ABackupDeptProviderApplication {

  public static void main(String[] args){
    SpringApplication.run(ABackupDeptProviderApplication.class, args);
  }
}
