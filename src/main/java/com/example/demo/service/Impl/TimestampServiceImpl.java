package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TimestampEntity;
import com.example.demo.service.TimestampService;
import com.example.demo.repository.TimestampRepo;
import java.util.List;

@Service
public class TimestampServiceImpl implements TimestampService{
  @Autowired TimestampRepo student;
  @Override
  public TimestampEntity postData(TimestampEntity stu){
    return student.save(stu);
  }
  @Override
  public List<TimestampEntity>getAllData(){
    return student.findAll();
  }
  @Override
  public String deleteData(Long id){
    student.deleteById(id);
    return "User with "+id+" deleted successful";
  }
  @Override
  public TimestampEntity getData(Long id){
    return student.findById(id).orElse(null);
  }
}