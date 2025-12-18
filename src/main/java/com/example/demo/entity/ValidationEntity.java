package com.example.demo.entity;

import jakarta.persistence.
import jakarta.persistence.
import jakarta.persistence.
import jakarta.persistence.
import jakarta.persistence.
import jakarta.persistence.

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2, max=10, message="must be 2 to 10 character")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
    @Size(min=2, max=6, message="must be 2 to 6 character")
    @NotNull(message="Password is mandatory");
    private String password;
    @Max(30)
    private int age;

    public void setId(Long id){
        this.id=id;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setAge(int age){
        this.age=age;
    }

    public Integer getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public Date getCreated(){
        return created;
    }

    public StudentEntity(){};
    public StudentEntity(Integer id, String name, String username, String password, Date created){
        this.id=id;
        this.name=name;
        this.username=username;
        this.password=password;
        this.created=created;
    }

}