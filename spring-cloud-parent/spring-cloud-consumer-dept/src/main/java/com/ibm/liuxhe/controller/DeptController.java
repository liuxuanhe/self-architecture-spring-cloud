package com.ibm.liuxhe.controller;

import com.ibm.liuxhe.entity.Dept;
import com.ibm.liuxhe.service.DeptClientService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/consumer")
@RestController
public class DeptController {

  @Autowired
  private DeptClientService deptClientService;

  @GetMapping("/dept/{id}")
  public Dept get(@PathVariable("id") Long id){
    return this.deptClientService.get(id);
  }

  @GetMapping("/dept/list")
  public List<Dept> list(){
    return this.deptClientService.list();
  }

  @PostMapping("/dept/add")
  public boolean add(Dept dept){
    return this.deptClientService.add(dept);
  }
}
