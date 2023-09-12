package metodos;

import java.util.Scanner;

public class MinhaCalculadora {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1;
        int valor2;
        int operacao;

        System.out.println("Digite um numero: ");
        
        valor1 = scan.nextInt();

        System.out.println("Digite outro numero: ");
        valor2 = scan.nextInt();

        System.out.println("Escolha a operação aritmética básica:" + "\nDigite 1 para multiplicação" + "\nDigite 2 para adição" + "\nDigite 3 para subtração" + "\nDigite 4 para divisão");
        operacao = scan.nextInt();
    
        if (operacao == 2 ) {

            soma(valor1, valor2);

        } else if (operacao == 3) {
         
            subtracao(valor1, valor2);    
        
        } else if (operacao == 1){

            multiplicacao(valor1, valor2);

        } else if (operacao == 4){

            divisao(valor1, valor2);

        } else {
           System.out.println("Digite o símbolo correto");     
        }
    }


    public static void soma(int valor1, int valor2) {

        valor1 = valor1 + valor2;

        System.out.println("Resultado da Soma: " + valor1);
    }

    public static void subtracao(int valor1, int valor2){
        
        valor1 = valor1 - valor2;

        System.out.println("Resultado da Subtração: " + valor1);


    } 

    public static void multiplicacao(int valor1, int valor2){
        
        valor1 = valor1 * valor2;

        System.out.println("Resultado da Multiplicação: " + valor1);


    } 

    public static void divisao(int valor1, int valor2){
        
        valor1 = valor1 / valor2;

        System.out.println("Resultado da Divisão: " + valor1);


    } 
   
}
