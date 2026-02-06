package com.isaac.juegosbackend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random

@RestController
class PiedraPapelTijeraController {

    @GetMapping("/piedra-papel-tijera")
    fun jugar(
        @RequestParam eleccionUsuario: String
    ): Map<String, String> {

        val opciones = listOf("piedra", "papel", "tijera")
        val eleccionComputadora = opciones[Random.nextInt(opciones.size)]

        val resultado = when {
            eleccionUsuario == eleccionComputadora -> "Empate"
            eleccionUsuario == "piedra" && eleccionComputadora == "tijera" -> "Ganaste"
            eleccionUsuario == "papel" && eleccionComputadora == "piedra" -> "Ganaste"
            eleccionUsuario == "tijera" && eleccionComputadora == "papel" -> "Ganaste"
            else -> "Perdiste"
        }

        return mapOf(
            "usuario" to eleccionUsuario,
            "computadora" to eleccionComputadora,
            "resultado" to resultado
        )
    }
}
