package segundasemana;

import java.util.Scanner;

public class EstruturaRepeticao {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
            
        String nome;
        int idade;

        System.out.println("Digite 0 para encerrar o programa");

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
        
            System.out.println("Idade: ");
            idade = scan.nextInt();
            if(idade == 0) break;

        }
        
        System.out.println("Clique em run novamente...");
    
    }

    
}
