package com.hansan.fenxiao.dao;

import java.util.List;

import com.hansan.fenxiao.entities.ProductCate;

public abstract interface IProductCateDao<T extends ProductCate> extends IBaseDao<T>
{
  public abstract List<T> listByFatherId(int paramInt);
}
