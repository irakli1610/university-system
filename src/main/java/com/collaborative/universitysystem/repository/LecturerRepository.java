package com.collaborative.universitysystem.repository;

import com.collaborative.universitysystem.entity.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface LecturerRepository extends JpaRepository<Lecturer, Long> {
}
