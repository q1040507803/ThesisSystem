package com.LeaYrx.service;

import com.LeaYrx.dao.CollegeMapper;
import com.LeaYrx.pojo.College;

import java.util.List;

public class CollegeServiceImpl implements CollegeService{

    private CollegeMapper collegeMapper;
    public void setCollegeMapper(CollegeMapper collegeMapper) {
        this.collegeMapper = collegeMapper;
    }

    public List<College> queryAllCollege() {
        return collegeMapper.queryAllCollege();
    }

    public College queryCollegeById(String cid) {
        return collegeMapper.queryCollegeById(cid);
    }

    public College queryCollegeByName(String cname) {
        return collegeMapper.queryCollegeByName(cname);
    }
}
