public class Conta{

    double saldo = 10.0;

    public double sacar (Double valor){

        double novoSaldo = saldo - valor;
        return novoSaldo;
    }

    public void imprimirSaldo (){

        System.out.println(saldo);
    }

}