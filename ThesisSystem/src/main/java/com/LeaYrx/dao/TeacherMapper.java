package com.LeaYrx.dao;

import com.LeaYrx.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //������ʦ
    int addTeacher(Teacher teacher);

    //ɾ����ʦ
    int deleteTeacherById(@Param("tid")String tid);

    int updateTeacher(Teacher teacher);

    //��ѯȫ����ʦ
    List<Teacher> queryAllTeacher();

    //��ѯ��ʦ
    Teacher queryTeacherById(@Param("tid")String tid);

    Teacher queryTeacherByName(@Param("tname")String tname);

}
