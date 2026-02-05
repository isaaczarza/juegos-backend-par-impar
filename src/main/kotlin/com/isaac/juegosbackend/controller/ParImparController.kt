package com.isaac.juegosbackend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ParImparController {

    @GetMapping("/api/par-impar")
    fun parImpar(@RequestParam numero: Int): String {
        return if (numero % 2 == 0) {
            "El número $numero es PAR"
        } else {
            "El número $numero es IMPAR"
        }
    }
}
