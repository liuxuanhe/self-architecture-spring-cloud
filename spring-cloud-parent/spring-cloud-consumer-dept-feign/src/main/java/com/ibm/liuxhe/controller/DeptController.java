package com.ibm.liuxhe.controller;

import com.ibm.liuxhe.entity.Dept;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/consumer")
@RestController
public class DeptController {

  private static final String REST_URL_PREFIX = "http://spring-cloud-provider-dept";

  @Autowired
  private RestTemplate restTemplate;

  @PostMapping("/dept/add")
  public boolean add(@RequestBody Dept dept){
    return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
  }

  @GetMapping("/dept/{id}")
  public Dept get(@PathVariable("id") Long id){
    return restTemplate.getForObject(REST_URL_PREFIX + "/dept/" +id, Dept.class);
  }

  @SuppressWarnings("unchecked")
  @GetMapping("/dept/list")
  public List<Dept> list(){
    return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
  }

  @GetMapping("/dept/discovery")
  public Object discovery(){
    return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
  }
}
