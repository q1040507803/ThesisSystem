package com.LeaYrx.service;

import com.LeaYrx.pojo.College;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollegeService {

    //查询全部学院
    List<College> queryAllCollege();

    //查询学院
    College queryCollegeById(String cid);

    College queryCollegeByName(String cname);
}
