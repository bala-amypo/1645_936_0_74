package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity stu){
        return ser.postData(stu);
    }

    @GetMapping("/get")
    public List<StudentEntity> getVal(){
        return ser.getAllData();
    }

    @DeleteMapping("/delete{id}")
    public String deleteValue(@PathVariable int id){
        return ser.deleteData(id);
    }
    @GetMapping("/get{id}")
    public StudentEntity getValue(@PathVariable int id){
        return ser.getData();
    }
}