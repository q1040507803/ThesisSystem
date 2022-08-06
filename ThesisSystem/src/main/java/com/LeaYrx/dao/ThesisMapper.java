package com.LeaYrx.dao;

import com.LeaYrx.pojo.Thesis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThesisMapper {
    //增加论文
    int addThesis(Thesis thesis);

    //删除论文
    int deleteThesisById(@Param("thid") int thid);

    //修改论文
    int updateThesis(Thesis thesis);

    //查询全部论文
    List<Thesis> queryAllThesis();

    //查找论文
    Thesis queryThesisById(@Param("thid") int thid);

    List<Thesis> queryThesisByName(@Param("thname") String thname);


}
