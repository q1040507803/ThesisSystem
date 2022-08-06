package com.LeaYrx.dao;

import com.LeaYrx.pojo.Student;
import com.LeaYrx.pojo.Thesis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //����ѧ��
    int addStudent(Student student);

    //ɾ��ѧ��
    int deleteStudentById(@Param("sid") String sid);

    //�޸�ѧ��
    int updateStudent(Student student);

    //��ѯȫ��ѧ��
    List<Student> queryAllStudent();

    //����ѧ��
    Thesis queryStudentById(@Param("sid") String sid);

    Thesis queryStudentByName(@Param("sname") String sname);
}
