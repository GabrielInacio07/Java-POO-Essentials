package Musicas.Modelo;

public class Audio {

    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private double curtidas;

    public Audio(String titulo, double duracao, int totalReproducoes, double curtidas) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.totalDeReproducao = totalReproducoes;
        this.curtidas = curtidas;
    }


    public void showAudio(){
        System.out.println("Titulo do Áudio: " + titulo);
        System.out.println("Duração em minutos: " + duracao);
        System.out.println("Total de Reproduções: " + totalDeReproducao);
        System.out.println("Numero de curtidas: " + curtidas);
    }

    public void curtir(){
        this.curtidas ++;
    }

    public void reproduzir(){
        this.totalDeReproducao++;
    }
}
