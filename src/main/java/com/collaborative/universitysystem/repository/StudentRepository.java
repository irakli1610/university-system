package com.collaborative.universitysystem.repository;

import com.collaborative.universitysystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface StudentRepository extends JpaRepository<Student, Long> {
}
