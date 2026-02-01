package Desafio.PO01;

public class ModeloCarro extends Carro {

    public ModeloCarro(String nome) {
        super(nome);
    }

    @Override
    public double getAveragePrice() {
        return super.getAveragePrice();
    }

    public void mostrarResumo() {
        System.out.println("\n----- RESUMO DO MODELO " + nome + " -----");
        System.out.println("Menor preço: " + getMenorPreco());
        System.out.println("Maior preço: " + getMaiorPreco());
        System.out.println("Preço médio (3 anos): " + getAveragePrice());
        System.out.println("--------------------------------------");
    }
}
