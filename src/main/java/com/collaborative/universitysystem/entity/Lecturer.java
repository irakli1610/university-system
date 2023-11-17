package com.collaborative.universitysystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "lecturer")
public class Lecturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;


    @OneToMany(mappedBy = "lecturer")
    private List<Attendance> attendances = new ArrayList<>();


    @ManyToMany
    @JoinTable(
            name = "subject_lecturer",
            joinColumns = @JoinColumn(name = "lecturer_id"),
            inverseJoinColumns = @JoinColumn(name = "subject_id"))
    private List<Subject> subjectsLecturer = new ArrayList<>();

}
