package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
	List<Student> findByFirstName(String firstName);
	List<Student> findByFirstNameLike(String firstName);
}
