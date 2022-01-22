package Estruturas_Basicas;

public class Main {
    public static void main(String[] args) {
        Carro carro1= new Carro(); //cria o primiro objeto sem valores em suas caracteristicas

        //define os valores do objeto carro1
        carro1.setCor("prata");
        carro1.setModelo("celta");
        carro1.setCapacidadeTanque(40);

        //imprime os os valores das caracteristricas do carro1
        System.out.println("Modelo: " + carro1.getModelo()); //imprime modelo
        System.out.println("Cor: " + carro1.getCor()); //imprime a cor
        System.out.println("Capacidade tanque: " + carro1.getCapacidadeTanque() + " litros"); //imprime a capacidade do tanque
        System.out.println("Preço para encher o tanque:" + carro1.encheTanque(6.54) + "R$"); //imprime o preço para encher o tanque

        Carro carro2 = new Carro("Preto","Corsa",35); //cria o segundo objeto, passando os parametros para os seus valores

        //imprime os os valores das caracteristricas do carro2
        System.out.println("Modelo: " + carro2.getModelo()); //imprime modelo
        System.out.println("Cor: " + carro2.getCor()); //imprime a cor
        System.out.println("Capacidade tanque: " + carro2.getCapacidadeTanque() + " litros"); //imprime a capacidade do tanque
        System.out.println("Preço para encher o tanque:" + carro2.encheTanque(6.54) + "R$"); //imprime o preço para encher o tanque
    }
}
