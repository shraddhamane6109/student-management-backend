package com.student.student_management.repository;

import com.student.student_management.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
	   Optional<User> findByEmail(String email);
}
