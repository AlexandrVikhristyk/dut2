package com.example.dut.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "userInfo")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<Todo> todos;
}