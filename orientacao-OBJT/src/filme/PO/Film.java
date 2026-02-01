package filme.PO;

import Calculadora.PO.Classificacao;

public class Film extends Catalog implements Classificacao {

    private String director;
    private String celebrityMain;
    private boolean oscarNominations;

    public Film(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaAvaliacoes, int totalDeAvaliaçao, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, somaAvaliacoes, totalDeAvaliaçao, duracaoEmMinutos);
    }

    public void insertFilm(String director, String celebrityMain, boolean oscarNominations){
        this.director = director;
        this.celebrityMain = celebrityMain;
        this.oscarNominations = oscarNominations;
    }
    @Override
    public void showCatalog(){
        super.showCatalog();

        System.out.println("\n===================== 🎥 DETALHES DO FILME =====================");
        System.out.println("🎬 Diretor: " + this.director);
        System.out.println("🌟 Ator/Atriz principal: " + this.celebrityMain);
        System.out.println("🏆 Indicações ao Oscar: " + (this.oscarNominations ? "Sim ✔️" : "Não ❌"));
        System.out.println("=================================================================\n");
    }

    @Override
    public int getClassificaco() {
        return (int) getAverageRating() / 2;
    }
}
