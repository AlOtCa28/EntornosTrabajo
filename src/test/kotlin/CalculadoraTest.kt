import org.junit.jupiter.api.Assertions.*

internal class CalculadoraTest {

    @org.junit.jupiter.api.Test
    fun suma() {
        var n1 = 6
        var n2 = 6

        var resultado : Int = n1 + n2

        assertEquals(12,resultado)
    }

    @org.junit.jupiter.api.Test
    fun resta() {
        var n1 = 10
        var n2 = 5

        var resultado : Int = n1 - n2

        assertEquals(5,resultado)
    }

    @org.junit.jupiter.api.Test
    fun multiplicacion() {
        var n1 = 5
        var n2 = 2

        var resultado : Int = n1 * n2

        assertEquals(10,resultado)
    }
}