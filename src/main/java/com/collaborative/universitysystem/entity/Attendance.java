package com.collaborative.universitysystem.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "attendance")
public class Attendance {

    //გადასახედია საერთოდ როგორ მუშაობს დასწრების სისტემა
    // სავარაუდოდ ერთი ფილდი უნდა დავამატო სადაც ჩაიწერება
    // დასწრება ან არ დასწრება
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "lecture_date")
    private Date lectureDate;




    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subjectAttendance;

    @ManyToOne
    @JoinColumn(name = "lecturer_id")
    private Lecturer lecturer;



}
