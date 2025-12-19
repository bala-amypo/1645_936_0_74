package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.service.TimestampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class TimestampController{
    @Autowired TimestampService ser;
    @PostMapping("/post")
    public TimestampEntity sendData(@RequestBody TimestampEntity stu){
        return ser.postData(stu);
    }

    @GetMapping("/get")
    public List<TimestampEntity> getVal(){
        return ser.getAllData();
    }

    // @DeleteMapping("/delete{id}")
    // public String deleteValue(@PathVariable Long id){
    //     return ser.deleteData(id);
    // }
    // @GetMapping("/get{id}")
    // public TimestampEntity getValue(@PathVariable Long id){
    //     return ser.getData(id);
    // }
}