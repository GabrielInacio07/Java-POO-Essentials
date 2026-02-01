package Desafio.PO05;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private int altura;
    private int largura;

    public CalculadoraSalaRetangular(int altura, int largura){
        this.altura = altura;
        this.largura = largura;
    }


    @Override
    public int calcularArea() {
        return altura * largura;
    }

    @Override
    public int calcularPerimetro() {
        return (altura * 2) + (largura * 2);
    }

    public void showCalculo(){
        System.out.println("O calculo da área: " + calcularArea());
        System.out.println("O calculo do perimetro: " + calcularPerimetro());
    }
}
