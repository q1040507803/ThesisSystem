package com.LeaYrx.controller;

import com.LeaYrx.pojo.College;
import com.LeaYrx.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    @Qualifier("CollegeServiceImpl")
    private CollegeService collegeService;

    @RequestMapping("/allCollege")
    public String list(Model model){
        List<College> list = collegeService.queryAllCollege();
        model.addAttribute("list",list);
        return "college/allCollege";
    }
}
