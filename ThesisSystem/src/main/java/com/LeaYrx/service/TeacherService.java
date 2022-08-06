package com.LeaYrx.service;

import com.LeaYrx.pojo.Teacher;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface TeacherService {
    //������ʦ
    int addTeacher(Teacher teacher);

    int updateTeacher(Teacher teacher);
    //ɾ����ʦ
    int deleteTeacherById(String tid);

    //��ѯȫ����ʦ
    List<Teacher> queryAllTeacher();

    //��ѯ��ʦ
    Teacher queryTeacherById(String tid);

    Teacher queryTeacherByName(String tname);
}
