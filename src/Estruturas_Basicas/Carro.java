package Estruturas_Basicas;

public class Carro {
    private String modelo;
    private String cor;
    private int capacidadeTanque;

//--------------------- CONSTRUTORES -------------------------

    public Carro(){

    }

    public Carro(String cor, String modelo, int capacidadeTanque){
        this.cor= cor;
        this.modelo= modelo;
        this.capacidadeTanque= capacidadeTanque;
    }

//------------------- GETTERS / SETTERS ---------------------
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //calcula o preço para encher o tanque
    public double encheTanque(double precoCombustivel){
        return precoCombustivel*getCapacidadeTanque();
    }
}
