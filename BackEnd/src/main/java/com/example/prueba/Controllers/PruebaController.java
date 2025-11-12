package com.example.prueba.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PruebaController {
    @GetMapping("/probar")
    public String probar() {
        return "Esto es una prueba de endPoint, si esta leyendo esto es porque el workflow y el despliegue funcionan correctamente";
    }
    
}
