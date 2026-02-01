package Musicas.Modelo;

public class Podcast extends Audio{

    private String host;
    private String coHost;
    private String description;

    public Podcast(String titulo, double duracao, int totalReproducoes,double curtidas){
        super(titulo,duracao,totalReproducoes,curtidas);
    }

    public void insertMyPodcast(String host, String coHost, String description){
        this.host = host;
        this.coHost = coHost;
        this.description = description;
    }

    @Override
    public void showAudio(){
        super.showAudio();

        System.out.println("\n========Detalhes Podcast========");
        System.out.println("Host: " + host);
        System.out.println("CoHost: " + coHost);
        System.out.println("Descrição: " + description);
    }
}
