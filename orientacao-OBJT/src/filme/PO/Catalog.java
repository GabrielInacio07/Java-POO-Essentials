package filme.PO;

public class Catalog {

    private String titulo;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliaçao;
    private int duracaoEmMinutos;


    public Catalog(String titulo, int anoDeLancamento, boolean incluidoNoPlano, double somaAvaliacoes, int totalDeAvaliaçao, int duracaoEmMinutos){

        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.somaDasAvaliacoes = somaAvaliacoes;
        this.totalDeAvaliaçao = totalDeAvaliaçao;
        this.duracaoEmMinutos = duracaoEmMinutos;

    }

    public void showCatalog(){
        System.out.println("\n================= 🎞️ CATÁLOGO — TÍTULO =================");
        System.out.println("📌 Nome: " + this.titulo);
        System.out.println("📅 Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("🏷️ Disponível no plano?: " + (this.incluidoNoPlano ? "Sim ✔️" : "Não ❌"));
        System.out.println("⭐ Somatória das avaliações: " + getSomaDasAvaliacoes());
        System.out.println("🧮 Total de avaliações: " + getTotalDeAvaliaçao());
        System.out.println("⏳ Duração: " + this.duracaoEmMinutos + " minutos");
        System.out.println("📊 Média: " + String.format("%.2f", getAverageRating()));
        System.out.println("===========================================================\n");
    }

    public void evaluateTitle(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliaçao++;
    }

    public double getAverageRating() {
        if (totalDeAvaliaçao == 0) {
            return 0;
        }
        return this.somaDasAvaliacoes / totalDeAvaliaçao;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliaçao() {
        return totalDeAvaliaçao;
    }

    public int getDuracaoEmMinutos (){return duracaoEmMinutos;}




}
