package com.collaborative.universitysystem.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "grade")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "grade")
    private int grade;

    @Column(name = "grade_date")
    private Date gradeDate;


    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subjectGrade;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
