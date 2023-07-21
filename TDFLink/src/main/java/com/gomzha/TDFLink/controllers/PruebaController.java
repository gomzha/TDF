package com.gomzha.TDFLink.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PruebaController {


    @GetMapping("/prueba")
    public String holaPrueba(){
        return "hola prueba";
    }
}
