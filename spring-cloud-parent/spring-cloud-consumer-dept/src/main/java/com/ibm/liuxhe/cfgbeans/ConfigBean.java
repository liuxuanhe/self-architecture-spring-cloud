package com.ibm.liuxhe.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

//  @Bean
//  public UserService getUserService(){
//    return new UserServiceImpl();
//  }

  @Bean
  @LoadBalanced //Spring Cloud Ribbon 客户端的负载均衡
  public RestTemplate getRestTemplate(){
    return new RestTemplate();
  }

//  @Bean
//  public IRule myRule(){
//    return new RetryRule();
//  }
}
