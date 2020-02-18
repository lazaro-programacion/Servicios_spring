package com.servicespring.servicios.servicio;


import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

/**
 * HelloServiceImpl
 */
@Service
@RequestScope
public class HelloServiceImpl implements HelloService {

    Calendar c;

    @Override
    public String Hola() {

        return "Hola";
    }

    public String Time() {

        return c.getTime().toString();

    }

    public HelloServiceImpl() {
        this.c = new GregorianCalendar();

    }

   

    @Override
    public String edad(int dia, int mes, int anio) {

        Calendar fNacimiento = new GregorianCalendar(anio, mes - 1, dia); 
                                                                                                            
        c.getTime();    

       
        int edad = c.get(Calendar.YEAR) - fNacimiento.get(Calendar.YEAR);
      
        if (fNacimiento.get(Calendar.DAY_OF_YEAR) > c.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }

        return "La edad es " + edad; 
    }
}

