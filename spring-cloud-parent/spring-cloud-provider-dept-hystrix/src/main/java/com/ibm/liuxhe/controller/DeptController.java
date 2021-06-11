package com.ibm.liuxhe.controller;

import com.ibm.liuxhe.entity.Dept;
import com.ibm.liuxhe.service.intf.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

  @Autowired
  private DeptService deptService;

  @Autowired
  private DiscoveryClient discoveryClient;

  @PostMapping("/dept/add")
  public boolean add(@RequestBody Dept dept){
    return deptService.add(dept);
  }

  @HystrixCommand(fallbackMethod = "proxyError")
  @GetMapping("/dept/{id}")
  public Dept get(@PathVariable("id") Long id){

    Dept dept = deptService.get(id);

    if(null == dept){
      throw new RuntimeException("没有信息");
    }
    return dept;
  }


  public Dept proxyError(){
    Dept dept = new Dept("aa");
    return dept;
  }

  @GetMapping("/dept/list")
  public List<Dept> list(){
    return deptService.list();
  }

  @GetMapping("/dept/discovery")
  public Object discovery(){
    List<String> list = discoveryClient.getServices();
    System.out.println(list);

    List<ServiceInstance> srvList = discoveryClient.getInstances("spring-cloud-provider-dept");
    for (ServiceInstance element: srvList){
      System.out.println(element.getServiceId() + element.getHost() + element.getUri());
    }

    return this.discoveryClient;
  }
}
