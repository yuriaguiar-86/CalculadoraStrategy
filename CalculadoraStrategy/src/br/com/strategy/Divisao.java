
package br.com.strategy;

public class Divisao implements Strategy{

    @Override
    public void calculadora(float valor1, float valor2) {
        float resultado = (valor1 / valor2);
        
        System.out.printf("%.2f + %.2f = %.2f\n", valor1, valor2, resultado);
    }
    
}
