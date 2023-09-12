package oao.polimorfismoesocrescrita;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        // no exemplo de criação de objetos abaixo, no método 1 ocorre polimorfismo
        SuperClasse[] classes = new SuperClasse[] {new SubClasse1(), new SubClasse2(), new SuperClasse()};
    
        for (SuperClasse classe: classes){
            classe.metodo1();
        }

        System.out.println("");

        for (SuperClasse classe: classes){
            classe.metodo2();
        }
        
        System.out.println();

        SubClasse2 subClasse2 = new SubClasse2();
        subClasse2.metodo2();

    }    
}
