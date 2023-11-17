package com.collaborative.universitysystem.repository;

import com.collaborative.universitysystem.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface GradeRepository extends JpaRepository<Grade, Long> {
}
