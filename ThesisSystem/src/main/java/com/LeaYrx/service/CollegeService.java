package com.LeaYrx.service;

import com.LeaYrx.pojo.College;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollegeService {

    //��ѯȫ��ѧԺ
    List<College> queryAllCollege();

    //��ѯѧԺ
    College queryCollegeById(String cid);

    College queryCollegeByName(String cname);
}
