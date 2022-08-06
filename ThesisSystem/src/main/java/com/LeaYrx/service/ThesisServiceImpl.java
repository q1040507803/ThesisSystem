package com.LeaYrx.service;

import com.LeaYrx.dao.ThesisMapper;
import com.LeaYrx.pojo.Thesis;

import java.util.List;

public class ThesisServiceImpl implements ThesisService{

    private ThesisMapper thesisMapper;
    public void setThesisMapper(ThesisMapper thesisMapper) {
        this.thesisMapper = thesisMapper;
    }

    public int addThesis(Thesis thesis) {
        return thesisMapper.addThesis(thesis);
    }

    public int deleteThesisById(int thid) {
        return thesisMapper.deleteThesisById(thid);
    }

    public int updateThesis(Thesis thesis) {
        return thesisMapper.updateThesis(thesis);
    }

    public Thesis queryThesisById(int thid) {
        return thesisMapper.queryThesisById(thid);
    }

    public List<Thesis> queryAllThesis() {
        return thesisMapper.queryAllThesis();
    }

    public List<Thesis> queryThesisByName(String thname) {
        return thesisMapper.queryThesisByName(thname);
    }
}
