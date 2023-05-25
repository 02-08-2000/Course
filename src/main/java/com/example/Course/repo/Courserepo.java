package com.example.Course.repo;

import com.example.Course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Courserepo extends JpaRepository<Course,Long> {
}
