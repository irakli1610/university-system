package com.collaborative.universitysystem.repository;

import com.collaborative.universitysystem.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface GroupRepository extends JpaRepository<Group,Long> {
}
