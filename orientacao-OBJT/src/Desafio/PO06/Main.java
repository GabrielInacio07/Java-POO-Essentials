package Desafio.PO06;

public class Main {

    public static void main(String[] args) {

        Produto p = new Produto("Notebook", "Eletrônico", 2, 3500);
        Servico s = new Servico("Manutenção", 120, 5);

        System.out.println("=== PRODUTO ===");
        p.showProduct();
        System.out.println("Preço total com desconto: " + p.calcularPrecoTotal());

        System.out.println("\n=== SERVIÇO ===");
        s.showService();
        System.out.println("Preço total com desconto: " + s.calcularPrecoTotal());
    }
}
