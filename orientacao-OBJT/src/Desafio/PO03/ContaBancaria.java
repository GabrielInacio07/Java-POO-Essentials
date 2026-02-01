package Desafio.PO03;

public class ContaBancaria {
    protected double saldo;

    public ContaBancaria (double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar (double valor){
        this.saldo -= valor;
    }

}
