package Desafio.PO04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConversorMoeda moeda = new ConversorMoeda();

        System.out.println("Digite o valor em dólar para converter em REAL:");
        double dolar = input.nextDouble();

        moeda.setDolar(dolar);

        double resultado = moeda.converterDolarParaReal(moeda.getDolar());

        System.out.println("Valor convertido: R$ " + String.format("%.2f", resultado));
    }
}
