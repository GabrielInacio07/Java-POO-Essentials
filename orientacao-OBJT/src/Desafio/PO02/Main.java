package Desafio.PO02;



public class Main {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        Animal cat = new Gato();

        dog.emitirSom(true);
        dog.emitirSom(false);
        dog.attack(true);
        dog.attack(false);

        cat.emitirSom(true);
        cat.emitirSom(false);
        cat.attack(true);
        cat.attack(false);
    }
}
