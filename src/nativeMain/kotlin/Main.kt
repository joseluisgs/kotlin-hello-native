import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toKString
import models.Pais
import platform.posix.*

fun main() {
    println("Hello, Kotlin/Native!")

    // El poder de usar Lazy en nativo!!!
    val fileName = "paises.csv"

    val paises by lazy {
        mutableListOf<Pais>()
    }

    // leemos los paises, igual que en C/C++ pero usando Lazy!!!!
    val fileInput by lazy { fopen(fileName, "r") }
    if (fileInput == null) {
        perror("cannot open input file $fileName")
        return
    }

    try {
        memScoped {
            val bufferLength = 64 * 1024
            val buffer = allocArray<ByteVar>(bufferLength)

            do {
                val nextLine = fgets(buffer, bufferLength, fileInput)?.toKString()
                if (nextLine == null || nextLine.isEmpty()) break
                // println(buffer.toKString())
                paises.add(Pais.fromCsvLine(nextLine))
            } while (true)
        } // memScoped
    } finally {
        fclose(fileInput)
    }
    // Ahora que tenemos los paises, podemos usarlos para filtar o lo que sea
    println("Paises")
    paises.forEach { println(it) }
    // Paises con e ordenados por capital
    val paisesConE = paises.filter { it.nombre.contains("E") }.sortedBy { it.capital }

    // O podemos escribirlos en un fichero esta vez sin lazy!
    val fileOutput = fopen("paises-con-E-out.csv", "w")
    if (fileOutput == null) {
        perror("cannot open output file paises2.csv")
        return
    }
    try {
        paisesConE.forEach { fprintf(fileOutput, "%s\n", Pais.toCsvLine(it)) }
    } finally {
        fclose(fileOutput)
    }
    paises.forEach { println(it) }
}
