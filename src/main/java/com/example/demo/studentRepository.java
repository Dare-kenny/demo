package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface studentRepository extends JpaRepository<student,Integer> {
}
