package Interface;

public class calculadora implements operacaoMatematicas{

    //Implementa as funçoes da interface operacaoMatematicas
    @Override
    public void soma(double numero1, double numero2) {
        System.out.println(numero1 + " + " + numero2 + "= " + (numero1+numero2));
    }

    @Override
    public void subtracao(double numero1, double numero2) {
        System.out.println(numero1 + " - " + numero2 + "= " + (numero1-numero2));
    }

    @Override
    public void multiplicacao(double numero1, double numero2) {
        System.out.println(numero1 + " * " + numero2 + "= " + (numero1*numero2));
    }

    @Override
    public void divisao(double numero1, double numero2) {
        System.out.println(numero1 + " / " + numero2 + "= " + (numero1/numero2));
    }
}
