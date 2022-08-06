package com.LeaYrx.controller;

import com.LeaYrx.pojo.College;
import com.LeaYrx.pojo.Teacher;
import com.LeaYrx.service.CollegeService;
import com.LeaYrx.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    @Qualifier("TeacherServiceImpl")
    private TeacherService teacherService;

    @Autowired
    @Qualifier("CollegeServiceImpl")
    private CollegeService collegeService;

    @RequestMapping("/allTeacher")
    public String list(Model model){
        List<Teacher> teachers = teacherService.queryAllTeacher();
        for (Teacher teacher : teachers) {
            College college = collegeService.queryCollegeById(teacher.getCid());
            teacher.setCname(college.getCname());
        }
        model.addAttribute("teachers",teachers);
        return "teacher/allTeacher";
    }

    @RequestMapping("/toAddTeacher")
    public String toAddPaper(Model model){
        List<College> colleges = collegeService.queryAllCollege();
        model.addAttribute("colleges",colleges);
        return "teacher/addTeacher";
    }

    @RequestMapping("/addTeacher")
    public String addTeacher(Teacher teacher){
        College college = collegeService.queryCollegeByName(teacher.getCname());
        teacher.setCid(college.getCid());

        List<Teacher> teachers = teacherService.queryAllTeacher();
        int flag = 1;
        for (Teacher teacher1 : teachers) {
            if(teacher.getTid().equals(teacher1.getTid()))
                flag = 0;
        }
        //存在--更新，不存在--新增
        if(flag == 0){
            teacherService.updateTeacher(teacher);
        }else{
            teacherService.addTeacher(teacher);
        }
        return "redirect:/teacher/allTeacher";
    }

    @RequestMapping("/deleteTeacher/{tid}")
    public String deleteBook(@PathVariable("tid") String id){
        teacherService.deleteTeacherById(id);
        return "redirect:/teacher/allTeacher";
    }
}
