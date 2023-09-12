package operadoresevariaveis;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        int diferencaPreco = M - S; 
        int D = (diferencaPreco * 100) / M;

        System.out.println("O desconto foi de " + D + "%");
    }
}
