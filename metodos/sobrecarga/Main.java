package metodos.sobrecarga;

public class Main {
    
    public static void main(String[] args) {
        
        // Área do quadrado6
        System.out.println("Informe o valor do lado do quadrado: ");
        AreasQuadrilateros.area(AreasQuadrilateros.entradaNumero());
    
        // Área do retângulo
        System.out.println("Informa a base a altura do retângulo, respectivamente: ");
        AreasQuadrilateros.area(AreasQuadrilateros.entradaNumero(), AreasQuadrilateros.entradaNumero());

        // área do trapézio
        System.out.println("Informe o valor da base menor, base maior e altura do trapézio,repectivamente: ");
        AreasQuadrilateros.area(AreasQuadrilateros.entradaNumero(), AreasQuadrilateros.entradaNumero(), AreasQuadrilateros.entradaNumero());

    }

}
