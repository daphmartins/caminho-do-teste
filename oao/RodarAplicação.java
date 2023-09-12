package oao;

public class RodarAplicação {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul escuro");
        carro1.setModelo("Uno Mille Fire");
        carro1.setCapacidadeTanque(50.0f);

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(5.41f));

        // OU

        Carro carro2 = new Carro("Preto fosco", "Honda civic", 50.0f);

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(5.34f));


    }
}
