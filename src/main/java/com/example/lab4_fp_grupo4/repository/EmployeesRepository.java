package com.example.lab4_fp_grupo4.repository;

import com.example.lab4_fp_grupo4.entity.Employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees,Integer> {




}
