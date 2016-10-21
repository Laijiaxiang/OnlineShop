package com.hansan.fenxiao.dao;

import java.util.List;

import com.hansan.fenxiao.entities.ArticleCate;

public abstract interface IArticleCateDao<T extends ArticleCate> extends IBaseDao<T>
{
  public abstract List<T> listByFatherId(int paramInt);
}
