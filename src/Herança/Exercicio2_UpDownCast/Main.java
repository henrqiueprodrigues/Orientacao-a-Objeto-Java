package Herança.Exercicio2_UpDownCast;

public class Main {
    public static void main(String[] args) {
        //Cria objetos de suas proprias classes
        Funcionario funcionario1= new Funcionario();
        Vendedor vendedor1= new Vendedor();
        Gerente gerente1= new Gerente();
        Faxineiro faxineiro1= new Faxineiro();

        //faz upcast
        Funcionario vendedor2= new Vendedor(); //vendedor -> funcionario
        Funcionario gerente2= new Gerente(); //gerente -> funcionario
        Funcionario faxineiro2= new Faxineiro(); //faxineiro -> funcionario

        //faz donwcast
        //Vendedor vendedor3= (Vendedor) new Funcionario(); //funcionario -> vendedor ocorre erro por incompatibilidade


    }
}
