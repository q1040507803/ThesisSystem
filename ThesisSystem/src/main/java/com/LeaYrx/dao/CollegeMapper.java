package com.LeaYrx.dao;

import com.LeaYrx.pojo.College;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface CollegeMapper {

    //查询全部学院
    List<College> queryAllCollege();

    //查询学院
    College queryCollegeById(@Param("cid") String cid);

    College queryCollegeByName(@Param("cname") String cname);



}
