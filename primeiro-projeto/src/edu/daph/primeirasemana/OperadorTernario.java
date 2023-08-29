package primeirasemana;

public class OperadorTernario{
    public static void main (String[] args){
      int a = 6;
      int b = 3;

      int resultado = a==b ? 1  : 0;
      System.out.print(resultado);
    }
}

/*
 * Operador ternário funciona como se fosse um if else.
 * Na expressão acima foi atribuído ao resultado a expressão com operador ternário.
 * Nela, a variável a está sendo comparada em relação de igualdade à variável b.
 * Isto é, se a for igual a b então 1, caso contrário, 0.
 */