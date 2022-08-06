package com.LeaYrx.service;

import com.LeaYrx.dao.StudentMapper;
import com.LeaYrx.pojo.Student;
import com.LeaYrx.pojo.Thesis;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    private StudentMapper studentMapper;
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public int deleteStudentById(String sid) {
        return studentMapper.deleteStudentById(sid);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public List<Student> queryAllStudent() {
        return studentMapper.queryAllStudent();
    }

    public Thesis queryStudentById(String sid) {
        return studentMapper.queryStudentById(sid);
    }

    public Thesis queryStudentByName(String sname) {
        return studentMapper.queryStudentByName(sname);
    }
}
