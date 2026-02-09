🎮 Juegos Backend API

Backend REST desarrollado con Spring Boot y Kotlin, enfocado en la implementación de juegos simples como práctica de arquitectura backend, controladores REST y lógica de negocio.

Proyecto académico y de portafolio profesional.

🛠️ Tecnologías

Kotlin

Spring Boot

Maven

Java 17

REST API

Git & GitHub

📌 Funcionalidades

Par o Impar: determina si un número es par o impar

Piedra, Papel o Tijera: permite jugar contra la computadora

🔗 Endpoints
Par o Impar
GET /parimpar?numero=5


Respuesta:

{
  "numero": 5,
  "resultado": "Impar"
}

Piedra, Papel o Tijera
GET /piedrapapeltijera?jugador=piedra


Respuesta:

{
  "jugador": "piedra",
  "computadora": "tijera",
  "resultado": "Ganaste"
}

▶️ Ejecución
mvn spring-boot:run


La aplicación se ejecuta en:

http://localhost:8080

📂 Estructura principal
src/main/kotlin/com/isaac/juegosbackend/controller

🚧 Estado del proyecto

En desarrollo.
Se planea agregar más juegos y mejorar la estructura del backend.

👤 Autor

Isaac Zarza
Estudiante de desarrollo de software
