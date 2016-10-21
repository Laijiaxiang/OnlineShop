package com.hansan.fenxiao.service;

import java.util.List;

import com.hansan.fenxiao.entities.ProductCate;

public abstract interface IProductCateService<T extends ProductCate> extends IBaseService<T>
{
  public abstract List<T> listByFatherId(int paramInt);
}