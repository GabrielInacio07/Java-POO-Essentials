package Desafio.PO02;

public class Gato extends Animal {

    @Override
    public void emitirSom(boolean status){
        if (status){
            System.out.println("O GATO está MIANDO");
        }else{
            System.out.println("O GATO está em silêncio");
        }
    }

    @Override
    public void attack(boolean status){
        if (status){
            System.out.println("O GATO está ARRANHANDO");
        }else{
            System.out.println("O GATO não está atacando");
        }
    }
}
