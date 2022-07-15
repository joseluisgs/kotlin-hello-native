package models

import extensions.toLocalDateTime
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant

data class Pais(
    val id: Int,
    val nombre: String,
    val sigla: String,
    val idioma: String,
    val moneda: String,
    val capital: String,
    val presupuesto: Double,
) {

    val createdAt: Instant = Clock.System.now()

    override fun toString(): String {
        return "Pais(id=$id, nome='$nombre', sigla='$sigla', idioma='$idioma', moneda='$moneda', capital='$capital', presupuesto=$presupuesto, createdAt=${createdAt.toLocalDateTime()})"
    }

    fun toJson(): String {
        return """
            {
                "id": $id,
                "nome": "$nombre",
                "sigla": "$sigla",
                "idioma": "$idioma",
                "moneda": "$moneda",
                "capital": "$capital",
                "presupuesto": $presupuesto,
                "createdAt": "${createdAt.toLocalDateTime()}"
            }
        """.trimIndent()
    }

    companion object {
        fun fromCsvLine(line: String): Pais {
            return line.split(";").map { it.trim() }.run {
                Pais(
                    id = get(0).toInt(),
                    nombre = get(1),
                    sigla = get(2),
                    idioma = get(3),
                    moneda = get(4),
                    capital = get(5),
                    presupuesto = get(6).toDouble()
                )
            }
        }

        fun toCsvLine(pais: Pais): String {
            return "${pais.id};${pais.nombre};${pais.sigla};${pais.idioma};${pais.moneda};${pais.capital};${pais.presupuesto}; ${pais.createdAt.toLocalDateTime()}"
        }
    }
}