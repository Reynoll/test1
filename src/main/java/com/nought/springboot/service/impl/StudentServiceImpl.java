package com.nought.springboot.service.impl;

import com.nought.springboot.mapper.StudentMapper;
import com.nought.springboot.model.Student;
import com.nought.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;
    @Override
    public Student queryById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Student> queryAll() {
        return mapper.selectAll();
    }
}
