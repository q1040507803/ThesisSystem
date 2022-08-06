package com.LeaYrx.controller;


import com.LeaYrx.pojo.College;
import com.LeaYrx.pojo.Student;
import com.LeaYrx.pojo.Teacher;
import com.LeaYrx.service.CollegeService;
import com.LeaYrx.service.StudentService;
import com.LeaYrx.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    @Qualifier("TeacherServiceImpl")
    private TeacherService teacherService;

    @Autowired
    @Qualifier("CollegeServiceImpl")
    private CollegeService collegeService;

    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    @RequestMapping("/allStudent")
    public String list(Model model){
        List<Student> students = studentService.queryAllStudent();
        for (Student student : students) {
            Teacher teacher = teacherService.queryTeacherById(student.getTid());
            student.setTname(teacher.getTname());
            College college = collegeService.queryCollegeById(student.getCid());
            student.setCname(college.getCname());
        }
        model.addAttribute("students",students);
        return "student/allStudent";
    }

    @RequestMapping("/toAddStudent")
    public String toAddPaper(Model model){
        List<Teacher> teachers = teacherService.queryAllTeacher();
        model.addAttribute("teachers",teachers);
        return "student/addStudent";
    }

    @RequestMapping("/addStudent")
    public String addTeacher(Student student){
        Teacher teacher = teacherService.queryTeacherByName(student.getTname());
        student.setTid(teacher.getTid());
        College college = collegeService.queryCollegeById(teacher.getCid());
        student.setCid(college.getCid());

        List<Student> students = studentService.queryAllStudent();
        int flag = 1;
        for (Student student1 : students) {
            if(student.getSid().equals(student1.getSid()))
                flag = 0;   //存在
        }
        //存在--更新，不存在--新增
        if(flag == 0){
            studentService.updateStudent(student);
        }else{
            studentService.addStudent(student);
        }

        return "redirect:/student/allStudent";
    }

    @RequestMapping("/deleteStudent/{sid}")
    public String deleteBook(@PathVariable("sid") String id){
        studentService.deleteStudentById(id);
        return "redirect:/student/allStudent";
    }
}
