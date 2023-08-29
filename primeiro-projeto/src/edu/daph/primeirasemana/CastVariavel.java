package primeirasemana;

public class CastVariavel{

    public static void main (String[] args) throws Exception{
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        System.out.print(numeroCurto2);
    }
    
}

/* Conceitos utilizados:
 * 1- utiliza o cast ao atribuir para uma variável short, uma variável int
 * 2- passar o valor (short) para numeroNormal para que pudesse ser atribuída para numeroCurto2
 * 3- O mesmo não ocorreu de short para int, na atribuição de numeroCuro para numeroNormal
*/