package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.List;
public interface StudentService{
    StudentEntity postData(StudentEntity student); //method declaration
    List<StudentEntity> getAllData();
    String deleteData(Integer id);
}