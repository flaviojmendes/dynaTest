package br.com.xys.utils;

/**
 * Classe que Calcula o que até uma criança de 5 anos sabe fazer.
 * @author flavio
 */
public class Calculadora {


    public static int somar(int... nums) {
        int resultado = 0;
        for(int num : nums) {
            resultado += num;
        }

        return resultado;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }
}
