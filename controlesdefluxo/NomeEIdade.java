package controlesdefluxo;

import java.util.Scanner;

public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade; 


    // O while determina uma sentença (poderia ser um clique em um botão) que levará o programa para o loop
    // esse loop deve ser repetido até que satisfaça a condição do break 

        while (true) {
            
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) {
                break;
            }

            System.out.println("Idade: ");;
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui");

    }
}
