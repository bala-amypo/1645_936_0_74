package com.example.demo.entity;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2, max=30)
    private String 
}