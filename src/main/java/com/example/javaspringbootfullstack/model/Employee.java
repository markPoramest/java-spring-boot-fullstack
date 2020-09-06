package com.example.javaspringbootfullstack.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data //ไม่ต้องทำ Getter Setter
@Entity
@Table(name = "Employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Transient
    private String confirm_password;
    @Column(name = "salary")
    private int salary;

}
