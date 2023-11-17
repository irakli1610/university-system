package com.collaborative.universitysystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "credit")
    private int credit;

    @OneToMany(mappedBy = "subjectAttendance")
    private List<Attendance> attendances = new ArrayList<>();

    @OneToMany(mappedBy = "subjectGrade")
    private List<Grade> grades = new ArrayList<>();

    @ManyToMany(mappedBy = "subjectsStudent")
    private List<Student> students = new ArrayList<>();

    @ManyToMany(mappedBy = "subjectsLecturer")
    private List<Lecturer> lecturers = new ArrayList<>();


}
