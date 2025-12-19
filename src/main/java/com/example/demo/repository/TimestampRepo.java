package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.TimestampEntity;

@Repository
public interface TimestampRepo extends JpaRepository<TimestampEntity,Long>{

}