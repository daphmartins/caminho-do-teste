package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ExemploList{
    public static void main(String[] args) {
        
//        List<Double> notas = new ArrayList<>();

//        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(3.6);
        notas.add(9.3);
        notas.add(0.0);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 3.6: " + notas.indexOf(0d));

        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 0.0 pela nota 6.0: ");
        notas.set(notas.indexOf(0.0), 6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 7.0 está na lista: " + notas.contains(7d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota); 

    }
}