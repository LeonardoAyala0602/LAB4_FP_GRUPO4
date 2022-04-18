package com.example.lab4_fp_grupo4.repository;

import com.example.lab4_fp_grupo4.entity.Jobs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, String> {
}
