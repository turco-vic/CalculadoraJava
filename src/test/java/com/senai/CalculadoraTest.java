package com.senai;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // Anotacao para dizer que a funcao e de teste
    @Test
    void testarSoma() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(3, 2);
        // metodo assertEquals compara o resultado que esperamos com o resultado real
        assertEquals(5, resultado);
    }

    // Funcao para testar a multiplicacao
    @Test
    void testarMult() {
        Calculadora calc = new Calculadora();
        int res = calc.multiplicacao(3, 2);
        assertEquals(6, res);
    }

    @Test
    void testarDiv() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(6, 2);
        assertEquals(3, resultado);
    }

    // Divisao de int por zero lanca ArithmeticException,
    // o assertThrows verifica que a excecao esperada acontece
    @Test
    void testarDivPorZero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(6, 0));
    }

}
