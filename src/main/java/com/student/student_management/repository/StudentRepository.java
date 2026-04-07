package com.student.student_management.repository;

import com.student.student_management.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
