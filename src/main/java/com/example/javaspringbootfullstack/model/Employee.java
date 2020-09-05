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
    private int id;

    private String first_name;

    private String last_genre;

    private String email;

    private String password;
    @Transient
    private String confirm_password;

    private int salary;

}
