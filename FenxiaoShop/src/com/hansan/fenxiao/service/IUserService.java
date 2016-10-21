package com.hansan.fenxiao.service;

import com.hansan.fenxiao.entities.User;
import java.util.List;

public abstract interface IUserService<T extends User> extends IBaseService<T>
{
  public abstract User getUserByName(String paramString);

  public abstract User getUserByPhone(String paramString);

  public abstract User getUserByNameAndPhone(String paramString1, String paramString2);

  public abstract User login(String paramString1, String paramString2);

  public abstract User getUserByNo(String paramString);

  public abstract List<User> levelUserList(String paramString);

  public abstract List<User> levelUserTodayList(String paramString);

  public abstract List<User> levelUserTodayStatusList(String paramString);
}
 