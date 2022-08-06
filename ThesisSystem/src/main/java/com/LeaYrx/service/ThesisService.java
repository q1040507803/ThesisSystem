package com.LeaYrx.service;

import com.LeaYrx.pojo.Thesis;

import java.util.List;

public interface ThesisService {
    //��������
    int addThesis(Thesis thesis);

    //ɾ������
    int deleteThesisById(int thid);

    //�޸�����
    int updateThesis(Thesis thesis);

    //��������
    Thesis queryThesisById(int thid);

    //��ѯȫ������
    List<Thesis> queryAllThesis();

    List<Thesis> queryThesisByName(String thname);

}
