package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import java.util.List;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;


@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/post1")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity stu){
        return ser.postData(stu);
    }

    // @GetMapping("/get")
    // public List<StudentEntity> getVal(){
    //     return ser.getAllData();
    // }

    // @DeleteMapping("/delete{id}")
    // public String deleteValue(@PathVariable int id){
    //     return ser.deleteData(id);
    // }
    @GetMapping("/get{id}")
    public ValidationEntity getValue(@PathVariable int id){
        return ser.getData(id);
    }
}