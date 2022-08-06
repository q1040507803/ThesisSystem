package com.LeaYrx.service;

import com.LeaYrx.pojo.Student;
import com.LeaYrx.pojo.Thesis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    //增加学生
    int addStudent(Student student);

    //删除学生
    int deleteStudentById(String sid);

    //修改学生
    int updateStudent(Student student);

    //查询全部学生
    List<Student> queryAllStudent();

    //查找学生
    Thesis queryStudentById(String sid);

    Thesis queryStudentByName(String sname);
}
