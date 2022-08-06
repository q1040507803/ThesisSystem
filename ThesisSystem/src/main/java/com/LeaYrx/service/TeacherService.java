package com.LeaYrx.service;

import com.LeaYrx.pojo.Teacher;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface TeacherService {
    //新增导师
    int addTeacher(Teacher teacher);

    int updateTeacher(Teacher teacher);
    //删除导师
    int deleteTeacherById(String tid);

    //查询全部导师
    List<Teacher> queryAllTeacher();

    //查询导师
    Teacher queryTeacherById(String tid);

    Teacher queryTeacherByName(String tname);
}
