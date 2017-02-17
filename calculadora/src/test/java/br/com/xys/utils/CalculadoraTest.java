package br.com.xys.utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Teste da classe Calculadora.
 * @author flavio
 */
public class CalculadoraTest {

    @Test
    public void testaSoma() {
        assertEquals(4, Calculadora.somar(2,2));
    }

    @Test
    public void testaSomaZero() {
        assertEquals(0, Calculadora.somar());
    }

    @Test
    public void testaSubtracao() {
        assertEquals(5, Calculadora.subtrair(10,5));
    }

}
