package com.LeaYrx.controller;

import com.LeaYrx.pojo.*;
import com.LeaYrx.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/thesis")
public class ThesisController {

    @Autowired
    @Qualifier("ThesisServiceImpl")
    private ThesisService thesisService;

    @Autowired
    @Qualifier("TeacherServiceImpl")
    private TeacherService teacherService;

    @Autowired
    @Qualifier("CollegeServiceImpl")
    private CollegeService collegeService;

    @Autowired
    @Qualifier("StudentServiceImpl")
    private StudentService studentService;

    @Autowired
    @Qualifier("LoginServiceImpl")
    private LoginService loginService;

    @RequestMapping("/allThesis")
    public String list(Model model){

        List<Thesis> list = thesisService.queryAllThesis();
        model.addAttribute("list",list);
        return "thesis/allThesis";
    }

    //��ҳ
    @RequestMapping("/login")
    public String Login(@RequestParam("uid")String uid, @RequestParam("password")String password, Model model){
        User user = new User();
        user.setUid(uid);
        user.setPassword(password);
        User login = loginService.Login(user);
        if(login == null){
            model.addAttribute("error","�û������������");
            return "login";
        }else{
            Date date = new Date();//��ȡ��ǰ������
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//�������ڸ�ʽ
            String ltime = df.format(date);//��ȡString���͵�ʱ��

            Log log = new Log();
            log.setUid(user.getUid());
            log.setLtime(ltime);
            loginService.addLog(log);

            return "redirect:/thesis/allThesis";
        }
    }



    //��ת����������
    @RequestMapping("/toAddThesis")
    public String toAddPaper(Model model){
        List<Teacher> teachers = teacherService.queryAllTeacher();
        model.addAttribute("teachers",teachers);
        return "thesis/addThesis";
    }

    //��������
    @RequestMapping("/addThesis")
    public String addThesis(Thesis thesis){
        //sid,sname,thname,tname
        //tname -> tid
        //tid -> cid -> cname
        Teacher teacher = teacherService.queryTeacherByName(thesis.getTeacher().getTname());
        College college = collegeService.queryCollegeById(teacher.getCid());

        Student student = thesis.getStudent();
        student.setTid(teacher.getTid());
        student.setCid(college.getCid());
        List<Student> students = studentService.queryAllStudent();
        int flag = 1;
        for (Student student1 : students) {
            if(student.getSid().equals(student1.getSid()))
                flag = 0;   //����
        }
        //����--���£�������--����
        if(flag == 0){
            studentService.updateStudent(student);
        }else{
            studentService.addStudent(student);
        }

        thesis.setStudent(student);
        thesis.setTeacher(teacher);
        thesis.setCollege(college);


        thesisService.addThesis(thesis);

        return "redirect:/thesis/allThesis";
    }

    //��ת���޸�����ҳ��
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Thesis thesis = thesisService.queryThesisById(id);
        List<Teacher> teachers = teacherService.queryAllTeacher();
        model.addAttribute("QThesis",thesis);
        model.addAttribute("teachers",teachers);
        return "thesis/updateThesis";
    }

    //�޸�����
    @RequestMapping("/updateThesis")
    public String updateThesis(Thesis thesis){

        Teacher teacher = teacherService.queryTeacherByName(thesis.getTeacher().getTname());
        College college = collegeService.queryCollegeById(teacher.getCid());

        Student student = thesis.getStudent();
        student.setTid(teacher.getTid());
        student.setCid(college.getCid());
        //��ȡȫ��ѧ�����ж��Ƿ����
        List<Student> students = studentService.queryAllStudent();
        int flag = 1;
        for (Student student1 : students) {
            if(student.getSid().equals(student1.getSid()))
                flag = 0;   //����
        }
        //����--���£�������--����
        if(flag == 0){
            studentService.updateStudent(student);
        }else{
            studentService.addStudent(student);
        }

        thesis.setStudent(student);
        thesis.setTeacher(teacher);
        thesis.setCollege(college);

        thesisService.updateThesis(thesis);
        return "redirect:/thesis/allThesis";
    }

    //ɾ������
    @RequestMapping("/deleteThesis/{thid}")
    public String deleteBook(@PathVariable("thid") int id){
        thesisService.deleteThesisById(id);
        return "redirect:/thesis/allThesis";

    }

    //ģ����ѯ����
    @RequestMapping("/queryThesis")
    public  String queryThesis(String qureyThesisName,Model model){
        List<Thesis> list = thesisService.queryThesisByName("%" + qureyThesisName + "%");
        if(list.isEmpty()){
            model.addAttribute("error","δ�鵽�����Ϣ");
            return "thesis/allThesis";
        }else {
            model.addAttribute("list",list);
            return "thesis/allThesis";
        }
    }


}
