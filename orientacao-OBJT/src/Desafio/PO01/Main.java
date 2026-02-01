package Desafio.PO01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ModeloCarro car = new ModeloCarro("CIVIC");
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("PREÇO ANUAL DO " + car.getName());
            System.out.println("Digite o " + (i + 1) + "º preço anual:");
            double valor = input.nextDouble();
            car.setPrice(i, valor);
        }

        car.mostrarResumo();
    }
}
