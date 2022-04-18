package com.example.lab4_fp_grupo4.repository;

import com.example.laboratorio4.entity.Departments;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments,Integer> {


}
