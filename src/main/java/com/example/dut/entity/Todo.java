package com.example.dut.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime deadline;
    private LocalDate createdDate;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
