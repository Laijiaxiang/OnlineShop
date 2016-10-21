package com.hansan.fenxiao.service;

import java.util.List;

import com.hansan.fenxiao.entities.Commission;

public abstract interface ICommissionService<T extends Commission> extends IBaseService<T>
{
  public abstract List<Commission> getByUser(Integer paramInteger);
}