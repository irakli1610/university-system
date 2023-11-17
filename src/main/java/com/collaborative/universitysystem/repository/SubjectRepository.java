package com.collaborative.universitysystem.repository;

import com.collaborative.universitysystem.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
