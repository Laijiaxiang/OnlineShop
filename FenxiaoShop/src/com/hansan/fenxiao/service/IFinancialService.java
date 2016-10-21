package com.hansan.fenxiao.service;

import java.util.List;

import com.hansan.fenxiao.entities.Financial;

public abstract interface IFinancialService<T extends Financial> extends IBaseService<T>
{
  public abstract List<Financial> getByUser(Integer paramInteger);
}