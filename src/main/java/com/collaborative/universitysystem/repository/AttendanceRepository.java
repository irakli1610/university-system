package com.collaborative.universitysystem.repository;

import com.collaborative.universitysystem.entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
