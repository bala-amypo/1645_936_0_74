package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 10, message = "must be 2 to 10 characters")
    private String username;

    @Email(message = "Email is not valid")
    private String email;

    @NotNull(message = "Password is mandatory")
    @Size(min = 2, max = 6, message = "must be 2 to 6 characters")
    private String password;

    @Positive(message = "Age must be a positive number")
    @Max(value = 30, message = "Age must not be greater than 30")
    private int age;

    // Constructors
    public ValidationEntity() {}

    public ValidationEntity(Long id, String username, String email, String password, int age) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
