package Desafio.PO03;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal = 0.1;

    public ContaCorrente(double saldo){
        super(saldo);
    }

    public double realSaldo(){
        double valor = this.saldo - (this.saldo * tarifaMensal);
        return valor;
    }
}
