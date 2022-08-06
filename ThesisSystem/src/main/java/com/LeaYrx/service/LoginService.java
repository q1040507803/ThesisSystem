package com.LeaYrx.service;

import com.LeaYrx.pojo.Log;
import com.LeaYrx.pojo.User;

import java.util.List;


public interface LoginService {
    User Login(User user);

    int addLog(Log log);


}
