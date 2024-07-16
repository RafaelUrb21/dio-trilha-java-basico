public class Conta {

    double saldo = 10.00;

    public void sacar(Double valor) {
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo(){
        System.out.println(saldo);

        //System.out.println(novoSaldo); não seria possível, pois "novoSaldo" é uma variável de outro metodo 
    }
}
