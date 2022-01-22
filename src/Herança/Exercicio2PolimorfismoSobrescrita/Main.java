package Herança.Exercicio2PolimorfismoSobrescrita;

public class Main {
    public static void main(String[] args) {
        Mae[] classes= new Mae[]{new Filho1(),new Filho2(),new Mae()}; //cria um vetor de objetos com um objeto de cada tipo

        for ( Mae classe: classes){ //chama o metodo1 para cada objeto dentro do vetor
            classe.metodo1();
        }

        System.out.println("\n");

        for ( Mae classe: classes){ //chama o metodo2 para cada objeto dentro do vetor
            classe.metodo2();
        }

        System.out.println("\n");

        Filho2  filho2= new Filho2();
        filho2.metodo2();

    }
}
