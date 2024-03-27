package pruebas_unitarias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora.numero1 = 5;
        Calculadora.numero2 = 3;
        Calculadora.sumar();
        assertEquals(8, Calculadora.numero1 + Calculadora.numero2);
    }

    @Test
    void testRestar() {
        Calculadora.numero1 = 5;
        Calculadora.numero2 = 3;
        Calculadora.restar();
        assertEquals(2, Calculadora.numero1 - Calculadora.numero2);
    }

    @Test
    void testMultiplicar() {
        Calculadora.numero1 = 5;
        Calculadora.numero2 = 3;
        Calculadora.multiplicar();
        assertEquals(15, Calculadora.numero1 * Calculadora.numero2);
    }

    @Test
    void testDividir() {
        Calculadora.numero1 = 6;
        Calculadora.numero2 = 3;
        Calculadora.dividir();
        assertEquals(2, Calculadora.numero1 / Calculadora.numero2);
    }

    @Test
    void testDividirEntre0() {
        Calculadora.numero1 = 5;
        Calculadora.numero2 = 0;
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir());
    }

}