package com.example.quiz_let.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "students")
@Data
public class Student {

    @Id
    @Column(name = "student_id")
    private Integer id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30,message = "Name should be between 2 and 30 characters")
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Min(value = 0, message = "Age should be greater than 0")
    @Column(name = "group_id")
    private Integer groupId;

    @NotEmpty(message = "Email should not be empty")
    @Email
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
