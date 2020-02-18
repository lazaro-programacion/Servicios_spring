package com.servicespring.servicios.controller;

import com.servicespring.servicios.servicio.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * ServicioController
 */

//@Controller
@RestController
@ResponseBody@RequestMapping ("/v1")//creamos carpeta raiz
public class ServicioController {

    @Autowired
    HelloService hs;
    
    @Autowired
    HelloService timeService;

    @GetMapping("/hola")
    @ResponseBody
    public String timeService() {
        return hs.Hola();
    }

    @GetMapping("/time")
    @ResponseBody

    public String Time() {

        return hs.Hola()+" "+ hs.Time();

    }

    @GetMapping("/edad") 
    @ResponseBody 
    public String edad(@RequestParam("dia") Integer dia,
            @RequestParam("mes") Integer mes, 
            @RequestParam("anio") Integer anio) {

        return timeService.edad(dia, mes, anio);
    }


}