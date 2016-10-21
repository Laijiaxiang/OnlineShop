package com.hansan.fenxiao.service;

import java.util.List;

import com.hansan.fenxiao.entities.ArticleCate;

public abstract interface IArticleCateService<T extends ArticleCate> extends IBaseService<T>
{
  public abstract List<T> listByFatherId(int paramInt);
}
