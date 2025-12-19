package com.example.demo.service;

import com.example.demo.entity.TimestampEntity;
import java.util.List;
public interface TimestampService{
    TimestampEntity postData(TimestampEntity student); //method declaration
    List<TimestampEntity> getAllData();
    String deleteData(Long id);
    TimestampEntity getData(Long id);
}