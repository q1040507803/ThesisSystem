package com.LeaYrx.dao;

import com.LeaYrx.pojo.Thesis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThesisMapper {
    //��������
    int addThesis(Thesis thesis);

    //ɾ������
    int deleteThesisById(@Param("thid") int thid);

    //�޸�����
    int updateThesis(Thesis thesis);

    //��ѯȫ������
    List<Thesis> queryAllThesis();

    //��������
    Thesis queryThesisById(@Param("thid") int thid);

    List<Thesis> queryThesisByName(@Param("thname") String thname);


}
