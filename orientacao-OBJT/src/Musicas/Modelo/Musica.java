package Musicas.Modelo;

public class Musica extends Audio{

    private String album;
    private String artista;
    private String genero;

    public Musica(String titulo, double duracao, int totalReproducoes,double curtidas){
        super(titulo,duracao,totalReproducoes,curtidas);
    }

    public void insertMusicDetails(String album, String artista, String genero){
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    @Override
    public void showAudio(){
        super.showAudio();

        System.out.println("\n========Detalhes Musica========");
        System.out.println("Album: " + album);
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
    }
}
