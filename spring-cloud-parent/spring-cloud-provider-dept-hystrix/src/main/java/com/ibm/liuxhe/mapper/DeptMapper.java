package com.ibm.liuxhe.mapper;

import com.ibm.liuxhe.entity.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptMapper {

  public boolean addDept(Dept dept);

  public Dept findById(Long id);

  public List<Dept> findAll();
}
