package Visibilidade_Classe4;

import Visisbilidade.Classe1;
//importa a classe1 de outro pacote, porem so consegue ver variaveis e metodos publicos e apenas intanciando o objeto

public class Classe4 {

    Classe1 classe1;

    void metodo(){
        String ve= classe1.variavel3;
        classe1.metodo3();
    }
}
