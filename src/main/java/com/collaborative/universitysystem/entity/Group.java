package com.collaborative.universitysystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "`group`")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "group_number")
    private String groupNumber;

    @Column(name = "department")
    private String department;

    @OneToMany(mappedBy = "group")
    private List<Student> students = new ArrayList<>();

}
