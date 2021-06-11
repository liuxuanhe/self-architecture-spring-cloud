package com.ibm.liuxhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication // EurekaServer服务器端启动类，接受其他微服务注册进来
public class ABackupEurekaServerApplication {

  public static void main(String[] args){
    SpringApplication.run(ABackupEurekaServerApplication.class, args);
  }

}
