package com.example.lab4_fp_grupo4.repository;

import com.example.lab4_fp_grupo4.entity.History;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends JpaRepository<History,Integer> {

    //COMPLETAR

}
