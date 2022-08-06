package com.LeaYrx.service;

import com.LeaYrx.dao.TeacherMapper;
import com.LeaYrx.pojo.Teacher;

import java.util.List;

public class TeacherServiceImpl implements TeacherService{

    private TeacherMapper teacherMapper;
    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public int addTeacher(Teacher teacher) {
       return teacherMapper.addTeacher(teacher);
    }

    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }

    public int deleteTeacherById(String tid) {
        return teacherMapper.deleteTeacherById(tid);
    }

    public List<Teacher> queryAllTeacher() {
       return teacherMapper.queryAllTeacher();
    }

    public Teacher queryTeacherById(String tid) {
        return teacherMapper.queryTeacherById(tid);
    }

    public Teacher queryTeacherByName(String tname) {
        return teacherMapper.queryTeacherByName(tname);
    }
}
