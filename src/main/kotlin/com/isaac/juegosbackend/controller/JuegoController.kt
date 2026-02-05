package com.isaac.juegosbackend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/juegos")
class JuegoController {

    @GetMapping("/hola")
    fun hola(): String {
        return "Backend funcionando correctamente "
    }
}



