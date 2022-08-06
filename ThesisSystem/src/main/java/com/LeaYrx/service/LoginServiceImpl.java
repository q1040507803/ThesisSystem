package com.LeaYrx.service;

import com.LeaYrx.dao.LoginMapper;
import com.LeaYrx.pojo.Log;
import com.LeaYrx.pojo.User;

import java.util.List;

public class LoginServiceImpl implements LoginService{
    private LoginMapper loginMapper;
    public void setLoginMapper(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public User Login(User user) {
        return loginMapper.Login(user);
    }

    public int addLog(Log log) {
        return loginMapper.addLog(log);
    }

}
