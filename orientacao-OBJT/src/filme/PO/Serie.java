package filme.PO;

public class Serie extends Catalog {

    private int temp;
    private boolean active;
    private int episodesPerSeason;
    private int minutePerSeason;

    public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano,
                 double somaAvaliacoes, int totalDeAvaliaçao, int duracaoEmMinutos) {
        super(nome, anoDeLancamento, incluidoNoPlano, somaAvaliacoes, totalDeAvaliaçao, duracaoEmMinutos);
    }

    public void insertSerie(int temporada, boolean active, int episodiosPorTemporada, int minutosPorSerie) {
        this.temp = temporada;
        this.active = active;
        this.episodesPerSeason = episodiosPorTemporada;
        this.minutePerSeason = minutosPorSerie;
    }

    @Override
    public void showCatalog() {
        super.showCatalog();

        System.out.println("\n===================== 📺 DETALHES DA SÉRIE =====================");
        System.out.println("📅 Temporadas: " + this.temp);
        System.out.println("🔄 Em exibição: " + (this.active ? "Sim ✔️" : "Não ❌"));
        System.out.println("🎞️ Episódios por temporada: " + this.episodesPerSeason);
        System.out.println("⏱️ Minutos por episódio: " + this.minutePerSeason);
        System.out.println("=================================================================\n");
    }
}
