package com.LeaYrx.dao;

import com.LeaYrx.pojo.Student;
import com.LeaYrx.pojo.Thesis;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //增加学生
    int addStudent(Student student);

    //删除学生
    int deleteStudentById(@Param("sid") String sid);

    //修改学生
    int updateStudent(Student student);

    //查询全部学生
    List<Student> queryAllStudent();

    //查找学生
    Thesis queryStudentById(@Param("sid") String sid);

    Thesis queryStudentByName(@Param("sname") String sname);
}
