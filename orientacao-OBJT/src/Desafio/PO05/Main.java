package Desafio.PO05;

public class Main {

    public static void main(String[] args) {
        CalculadoraSalaRetangular calcular = new CalculadoraSalaRetangular(20,10);

        calcular.calcularPerimetro();
        calcular.calcularArea();
        calcular.showCalculo();
    }
}
