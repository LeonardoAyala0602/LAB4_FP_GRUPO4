package com.example.lab4_fp_grupo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "/history")
public class HistoryController {

    @GetMapping(value = {"","/"})
    public String historialEmpleado(){
        //COMPLETAR
        return "/history";
    }



}
