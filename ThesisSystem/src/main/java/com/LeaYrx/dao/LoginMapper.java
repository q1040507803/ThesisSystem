package com.LeaYrx.dao;

import com.LeaYrx.pojo.Log;
import com.LeaYrx.pojo.User;

import java.util.List;

public interface LoginMapper {
   User Login(User user);

   int addLog(Log log);


}
