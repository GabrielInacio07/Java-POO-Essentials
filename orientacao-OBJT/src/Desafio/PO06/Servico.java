package Desafio.PO06;

public class Servico implements Vendavel {

    private String nome;
    private double valorHora;
    private int horas;

    public Servico(String nome, double valorHora, int horas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public void showService() {
        System.out.println("Serviço: " + nome);
        System.out.println("Valor por hora: " + valorHora);
        System.out.println("Horas contratadas: " + horas);
    }

    @Override
    public double calcularPrecoTotal() {
        double desconto = 0.15; // 15%

        double valorTotal = valorHora * horas;
        double valorComDesconto = valorTotal * desconto;

        return valorTotal - valorComDesconto;
    }
}
