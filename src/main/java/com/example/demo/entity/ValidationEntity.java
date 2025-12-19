// package com.example.demo.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.validation.constraints.NotNull;
// import jakarta.validation.constraints.Size;
// import jakarta.validation.constraints.Email;
// import jakarta.validation.constraints.Max;
// import jakarta.validation.constraints.Positive; 

// @Entity
// public class ValidationEntity{
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;
//     @NotNull
//     @Size(min=2, max=10, message="must be 2 to 10 character")
//     private String username;
//     @Email(message = "Email is not valid")
//     private String email;
//     @Size(min=2, max=6, message="must be 2 to 6 character")
//     @NotNull(message="Password is mandatory")
//     private String password;
//     @Max(30)
//     private int age;

//     public void setId(Long id){
//         this.id=id;
//     }
//     public void setUsername(String username){
//         this.username=username;
//     }
//     public void setEmail(String email){
//         this.email=email;
//     }
//     public void setPassword(String password){
//         this.password=password;
//     }
//     public void setAge(int age){
//         this.age=age;
//     }

//     public Long getId(){
//         return id;
//     }
//     public String getUsername(){
//         return username;
//     }
//     public String getEmail(){
//         return email;
//     }
//     public String getPassword(){
//         return password;
//     }
//     public int getAge(){
//         return age;
//     }

//     public ValidationEntity(){};
//     public ValidationEntity(long id,@NotNull @Size(min=2,max=10,message="must be 2 to 10 character") String username,
//                     @Email(message="Email is not Valid") String email,
//                     @Size(min=2,max=10,message="must be 2 to 10 character") @NotNull(message="Password should not be empty") String password,
//                     @Max(30) @Positive(message="Age must be a positive number" int age)){

//         this.id=id;
//         this.username=username;
//         this.email=email;
//         this.password=password;
//         this.age=age;
//     }

// }