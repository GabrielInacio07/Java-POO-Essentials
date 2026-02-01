package Desafio.PO06;

public class Produto implements Vendavel {

    private String nome;
    private String tipo;
    private int quantidade;
    private double preco;

    public Produto(String nome, String tipo,int quantidade ,double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void showProduct(){
        System.out.println("O produto é: " + nome);
        System.out.println("O tipo do produto é: " + tipo);
        System.out.println("A quantidade de produto comprado: " + quantidade);
        System.out.println("O preço do produto é: " + preco);
    }

    @Override
    public double calcularPrecoTotal() {
        double desconto = 0.30;

        double valor = preco * quantidade;
        double valorComDesconto = valor * desconto;
        double totalValor = valor - valorComDesconto;

        return totalValor;
    }


}
