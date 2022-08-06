package com.LeaYrx.dao;

import com.LeaYrx.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //新增导师
    int addTeacher(Teacher teacher);

    //删除导师
    int deleteTeacherById(@Param("tid")String tid);

    int updateTeacher(Teacher teacher);

    //查询全部导师
    List<Teacher> queryAllTeacher();

    //查询导师
    Teacher queryTeacherById(@Param("tid")String tid);

    Teacher queryTeacherByName(@Param("tname")String tname);

}
