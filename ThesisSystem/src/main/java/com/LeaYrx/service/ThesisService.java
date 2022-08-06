package com.LeaYrx.service;

import com.LeaYrx.pojo.Thesis;

import java.util.List;

public interface ThesisService {
    //增加论文
    int addThesis(Thesis thesis);

    //删除论文
    int deleteThesisById(int thid);

    //修改论文
    int updateThesis(Thesis thesis);

    //查找论文
    Thesis queryThesisById(int thid);

    //查询全部论文
    List<Thesis> queryAllThesis();

    List<Thesis> queryThesisByName(String thname);

}
