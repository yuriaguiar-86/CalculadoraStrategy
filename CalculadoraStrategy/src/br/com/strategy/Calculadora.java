
package br.com.strategy;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);      
        Strategy som = new Soma();
        Strategy sub = new Subtracao();
        Strategy div = new Divisao();
        Strategy mul = new Multiplicacao(); 
        
        short operacao;
              
        try{
            do{
                System.out.println("=== CALCULADORA ===");
                System.out.println("[1]Soma");
                System.out.println("[2]Subtração");
                System.out.println("[3]Multiplicação");
                System.out.println("[4]Divisão");
                System.out.println("[0]Sair");
                System.out.println("==================");

                operacao = tec.nextShort();

                switch(operacao){
                    case 0:
                        System.out.println("Obrigado");
                        break;
                    case 1:
                        System.out.println("");
                        som.calculadora(tec.nextFloat(), tec.nextFloat());
                        break;
                    case 2:
                        System.out.println("");
                        div.calculadora(tec.nextFloat(), tec.nextFloat());
                        break;
                    case 3:
                        System.out.println("");
                        mul.calculadora(tec.nextFloat(), tec.nextFloat());
                        break;
                    case 4:
                        System.out.println("");
                        div.calculadora(tec.nextFloat(), tec.nextFloat());
                        break;
                    default:
                        System.out.println("Digite uma operação válida.");
                        break;
                }
            }while(operacao != 0);
            
        }catch(java.util.InputMismatchException ex){
            System.out.println("Digite apenas números.");
        }
        
    }
}
