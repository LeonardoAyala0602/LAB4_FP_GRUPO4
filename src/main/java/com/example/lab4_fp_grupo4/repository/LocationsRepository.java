package com.example.lab4_fp_grupo4.repository;

import com.example.lab4_fp_grupo4.entity.Locations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationsRepository extends JpaRepository<Locations,Integer> {
}
