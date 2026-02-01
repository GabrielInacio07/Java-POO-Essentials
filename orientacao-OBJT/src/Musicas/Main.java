package Musicas;

import Musicas.Modelo.Audio;
import Musicas.Modelo.Musica;
import Musicas.Modelo.Podcast;

public class Main {

    public static void main(String[] args) {
        Musica myMusic = new Musica("Power",2.60,1000, 1000);
        Podcast myPodcast = new Podcast("FLOW Podcast",150,500,500);

//        myMusic.insertMusicDetails("my beautiful dark twisted fantasy","KANYE WEST","HIP-HOP");
//        myMusic.reproduzir();
//        myMusic.curtir();
//        myMusic.showAudio();

        myPodcast.insertMyPodcast("Igor 3k","Renato Cariani","Entrevistando RAMO DINO");
        myPodcast.showAudio();

    }
}
