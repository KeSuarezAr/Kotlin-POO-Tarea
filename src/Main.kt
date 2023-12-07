fun main() {
    // Creación de instancias de personas y almacenamiento en una lista
    val persona1 = Persona("Kevin", 19, "Estudiante")
    val persona2 = Persona("Juan", 20, "Estudiante")
    val persona3 = Persona("Pedro", 21, "Estudiante")
    val estudiantes: List<Persona> = listOf(persona1, persona2, persona3)

    // Iteración sobre la lista de estudiantes e impresión de sus detalles
    for (estudiante: Persona in estudiantes) {
        println(
            "Mi nombre es ${estudiante.nombre}, tengo ${estudiante.edad} años y mi ocupación es ${estudiante.ocupacion}"
        )
    }

    // Creación de instancias de vehículos y formas
    val coche = Coche()
    val bicicleta = Bicicleta()
    val circulo = Circulo(5.0)
    val cuadrado = Cuadrado(5.0)

    // Uso de los métodos de las clases implementadas
    coche.acelerar()
    bicicleta.acelerar()
    circulo.dibujar()
    cuadrado.dibujar()
}

// Definición de la clase Persona con propiedades nombre, edad y ocupación
class Persona(val nombre: String, val edad: Int, val ocupacion: String)

// Definición de la interfaz Vehiculo con un método abstracto acelerar()
interface Vehiculo {
    fun acelerar()
}

// Implementación de la interfaz Vehiculo para la clase Coche
class Coche : Vehiculo {
    override fun acelerar() {
        println("El coche está acelerando.")
    }
}

// Implementación de la interfaz Vehiculo para la clase Bicicleta
class Bicicleta : Vehiculo {
    override fun acelerar() {
        println("La bicicleta está siendo pedaleada.")
    }
}

// Definición de la clase abstracta Forma con propiedades y métodos abstractos
abstract class Forma {
    abstract val area: Double
    abstract fun dibujar()
}

// Implementación de la clase Forma para la clase Circulo
class Circulo(private val radio: Double) : Forma() {
    override val area: Double
        get() = Math.PI * radio * radio

    override fun dibujar() {
        println("Dibujando un círculo con área $area")
    }
}

// Implementación de la clase Forma para la clase Cuadrado
class Cuadrado(private val lado: Double) : Forma() {
    override val area: Double
        get() = lado * lado

    override fun dibujar() {
        println("Dibujando un cuadrado con área $area")
    }
}
