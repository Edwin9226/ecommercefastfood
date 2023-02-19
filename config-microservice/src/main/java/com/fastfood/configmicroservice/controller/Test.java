package com.fastfood.configmicroservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping
    public String info (){
      return "VERIFICA EL GET DE NUESTRO CONFIG SERVICE";
    }

}
