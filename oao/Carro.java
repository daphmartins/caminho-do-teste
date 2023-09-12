package oao;


class Carro {
    String cor;
    String modelo;
    float capacidadeTanque;

    // Construtor - sobrecarregado

    Carro(){

    }

    Carro(String cor, String modelo, float capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }


    // Atributos do objeto

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(float capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    float getCapacidadeTanque(){
        return capacidadeTanque;
    }

    float totalValorTanque(float valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
