package com.ibm.liuxhe.service.impl;

import com.ibm.liuxhe.entity.Dept;
import com.ibm.liuxhe.mapper.DeptMapper;
import com.ibm.liuxhe.service.intf.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {

  @Autowired
  DeptMapper deptMapper;

  @Override
  public boolean add(Dept dept) {
    return deptMapper.addDept(dept);
  }

  @Override
  public Dept get(Long id) {
    return deptMapper.findById(id);
  }

  @Override
  public List<Dept> list() {
    return deptMapper.findAll();
  }
}
