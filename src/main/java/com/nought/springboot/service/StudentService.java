package com.nought.springboot.service;

import com.nought.springboot.mapper.StudentMapper;
import com.nought.springboot.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    Student queryById(Integer id);
    List<Student> queryAll();
}
