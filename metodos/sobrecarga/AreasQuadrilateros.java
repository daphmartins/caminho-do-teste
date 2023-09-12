package metodos.sobrecarga;

import java.util.Scanner;

public class AreasQuadrilateros {
    
    public static double entradaNumero(){

        Scanner scan = new Scanner(System.in);

        double numero = scan.nextDouble();        
        return numero;

    } 

    public static void area(double lado){

        double areaQuadrado = lado * lado;
        System.out.println("A área do quadrado é: " + areaQuadrado);
        
    }

    public static void area(double base, double altura){

        double areaRetangulo = base * altura;
        System.out.println("A área do retângulo: " + areaRetangulo);

    }

    public static void area(double baseMenor, double baseMaior, double altura){
        
        double areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
        System.out.println("A área do trapézio é: " + areaTrapezio);

    }
    
}

