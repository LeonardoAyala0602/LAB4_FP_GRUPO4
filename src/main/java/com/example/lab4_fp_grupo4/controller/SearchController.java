package com.example.lab4_fp_grupo4.controller;


import com.example.lab4_fp_grupo4.entity.Employees;
import com.example.lab4_fp_grupo4.repository.DepartmentsRepository;
import com.example.lab4_fp_grupo4.repository.EmployeesRepository;
import com.example.lab4_fp_grupo4.repository.LocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/Search")
public class SearchController {

    @Autowired
    EmployeesRepository employeesRepository;

    @Autowired
    DepartmentsRepository departmentsRepository;

    @Autowired
    LocationsRepository locationsRepository;

    @GetMapping("")
    public String indice() {
        return "Search/indice";
    }

    @GetMapping("/Salario")
    public String listaEmpleadosMayorSalrio(Model model) {

        model.addAttribute("lista", employeesRepository.empleadoMayor());
        return "Search/lista2";
    }

    @GetMapping("/Promdep")
    public String cantidadEmpleadosPorPais(Model model) {

        model.addAttribute("listaDepSalario", departmentsRepository.listaDepartamentoSalario());
        return "/Search/salario";
    }

    @GetMapping("/listar")
    public String listarEmpleadoDep(@ModelAttribute("employees") Employees employees,
                                    @RequestParam("id") int depid, Model model, RedirectAttributes attr) {

        model.addAttribute("EmpleadoPorDepartamento", departmentsRepository.listaEmpleadoPorDepartamento(depid));
        return "/Search/lista3";

    }
}
