package com.LeaYrx.service;

import com.LeaYrx.pojo.Student;
import com.LeaYrx.pojo.Thesis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    //����ѧ��
    int addStudent(Student student);

    //ɾ��ѧ��
    int deleteStudentById(String sid);

    //�޸�ѧ��
    int updateStudent(Student student);

    //��ѯȫ��ѧ��
    List<Student> queryAllStudent();

    //����ѧ��
    Thesis queryStudentById(String sid);

    Thesis queryStudentByName(String sname);
}
