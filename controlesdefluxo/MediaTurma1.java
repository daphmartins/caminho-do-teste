package controlesdefluxo;

import java.util.Scanner;

public class MediaTurma1 {
     public static void main(String[] args) {
        
  
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira idade: ");
        int idade1 = leitor.nextInt();
        System.out.println("Digite a segunda idade: ");
        int idade2 = leitor.nextInt();
        System.out.println("Digite a terceira idade: ");
        int idade3 = leitor.nextInt();

        int mediaIdade = (idade1 + idade2 + idade3) / 3;

        System.out.println("A média da idade é: " + mediaIdade);
        
        if (mediaIdade >= 0 && mediaIdade <= 25){
            System.out.println("Jovem!");
        } else if (mediaIdade >= 26 && mediaIdade < 60){
            System.out.println("Adulta!");
        } else if (mediaIdade > 0 && mediaIdade >= 60){
            System.out.println("Idosa!");
        } else{
          System.out.println("Idades informadas foram inválidas");
        }
        
    
      
    }
}
