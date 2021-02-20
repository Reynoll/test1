package com.nought.springboot.controller;

import com.nought.springboot.model.Student;
import com.nought.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping("/id")
    public Student queryById(Integer id) {
        Student student = service.queryById(id);
        System.out.println(student);
        return student;
    }
    @RequestMapping("/zs")
    public String test(Integer id) {
        return "Hello world, 张三";
    }
    @RequestMapping("/mv")
    public ModelAndView mv() {
        Student student = new Student();
        student.setId(1);
        student.setAge(14);
        student.setName("zhangsan");
        ModelAndView mv = new ModelAndView();
        mv.addObject("student",student);
        mv.setViewName("userDetail");
        return mv;
    }
    @RequestMapping("/mv1")
    public ModelAndView mv1() {
        List<Student> stus = service.queryAll();
        System.out.println(stus.size());
        ModelAndView mv = new ModelAndView();
        mv.addObject("stus",stus);
        mv.setViewName("userDetail");
        return mv;
    }
}
