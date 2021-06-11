package com.ibm.liuxhe.service;

import com.ibm.liuxhe.entity.Dept;
import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "spring-cloud-provider-dept")
public interface DeptClientService {

  @PostMapping("/dept/add")
  public boolean add(@RequestBody Dept dept);

  @GetMapping("/dept/{id}")
  public Dept get(@PathVariable("id") Long id);

  @GetMapping("/dept/list")
  public List<Dept> list();
}
