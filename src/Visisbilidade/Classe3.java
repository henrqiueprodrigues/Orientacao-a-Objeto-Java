package Visisbilidade;

public class Classe3 {

    Classe1 classe1; //como não herda tem de instaciar o objeto dentro da classe

    void metodo(){ //puxa os valores e os metodos a partir de mensagens pelo objeto
        String ve1= classe1.variavel2;
        String ve2= classe1.variavel3;
        classe1.metodo2();
        classe1.metodo3();
    }

}
