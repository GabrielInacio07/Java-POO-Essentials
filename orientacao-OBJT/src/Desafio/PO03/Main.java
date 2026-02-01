package Desafio.PO03;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(1000);
        System.out.println("Saldo inicial: " + conta.saldo);

        conta.depositar(500);
        System.out.println("Após depósito de 500: " + conta.saldo);

        conta.sacar(200);
        System.out.println("Após saque de 200: " + conta.saldo);

        System.out.println("Saldo real com tarifa de 10%: " + conta.realSaldo());
    }
}
