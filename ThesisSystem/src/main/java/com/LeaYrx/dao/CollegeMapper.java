package com.LeaYrx.dao;

import com.LeaYrx.pojo.College;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface CollegeMapper {

    //��ѯȫ��ѧԺ
    List<College> queryAllCollege();

    //��ѯѧԺ
    College queryCollegeById(@Param("cid") String cid);

    College queryCollegeByName(@Param("cname") String cname);



}
