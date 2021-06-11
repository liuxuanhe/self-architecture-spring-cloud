package com.ibm.liuxhe.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {
  private Long deptno;
  private String dname;
  private String db_source;

  public Dept(String dname){
    super();
    this.dname = dname;
  }
}