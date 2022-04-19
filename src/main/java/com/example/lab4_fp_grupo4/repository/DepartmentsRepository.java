package com.example.lab4_fp_grupo4.repository;

import com.example.lab4_fp_grupo4.entity.Departments;


import dto.DepartamentoSalario;
import dto.EmpleadoMayorSalario;
import dto.EmpleadoPorDepartamento;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentsRepository extends JpaRepository<Departments,Integer> {
    @Query(value = "select e.employee_id as employeeid, e.first_name as nombre, e.last_name as apellido, j.job_title as cargo, e.salary as sueldo\n" +
            "from employees e\n" +
            "join jobs j on (e.job_id=j.job_id) \n" +
            "where e.department_id = ?1 \n" +
            "order by e.salary desc;", nativeQuery = true)
    List<EmpleadoPorDepartamento> listaEmpleadoPorDepartamento(int depid);

    @Query(value = "select d.department_name as depname, round(avg(e.salary)) as promedio, d.department_id as depid\n" +
            "from departments d\n" +
            "join employees e on (d.department_id= e.department_id)\n" +
            "group by d.department_name",nativeQuery = true)
    List<DepartamentoSalario> listaDepartamentoSalario();
}

