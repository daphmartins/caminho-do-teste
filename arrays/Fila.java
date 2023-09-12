package arrays;

import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
      

        String[] nomesFila = new String[3];
        Scanner nome = new Scanner(System.in); 
    
    
        int count = 0;
        
        do{
        String nomes = nome.next();
        nomesFila[count] = nomes;
        count++;

        }while(count < nomesFila.length);
        
        for (String nomefila : nomesFila) {

            if (nomefila == nomesFila[0]) {
                System.out.println(nomefila + " - esta na posicao 1");
            } else if (nomefila == nomesFila[1]) {
                System.out.println(nomefila + " - esta na posicao 2");
            } else if (nomefila == nomesFila[2]) {
                System.out.println(nomefila + " - esta na posicao 3");
            }
            
        }
    
    }
}
