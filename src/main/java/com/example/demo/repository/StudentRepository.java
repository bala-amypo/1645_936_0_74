package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.jpaRepository;
import com.example.demo.entity.StudentEntity;

@Repository
public interface StudentRepo extends jpaRepository<StudentEntity,Integer>{

}