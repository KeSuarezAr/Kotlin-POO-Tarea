fun main() {

    val persona1 = Persona("Kevin", 19, "Estudiante")
    val persona2 = Persona("Juan", 20, "Estudiante")
    val persona3 = Persona("Pedro", 21, "Estudiante")

    val estudiantes = listOf(persona1, persona2, persona3)

    for (estudiante in estudiantes) {
        println(
                "Mi nombre es ${estudiante.nombre}, tengo ${estudiante.edad} años y mi ocupacion es ${estudiante.ocupacion}"
        )
    }

    val coche = Coche()
    val bicicleta = Bicicleta()

    coche.acelerar()
    bicicleta.acelerar()
}

class Persona(val nombre: String, val edad: Int, val ocupacion: String)

interface Vehiculo {
    fun acelerar()
}

class Coche : Vehiculo {
    override fun acelerar() {
        println("El coche está acelerando.")
    }
}

class Bicicleta : Vehiculo {
    override fun acelerar() {
        println("La vicicleta esta siendo pedaleada.")
    }
}

