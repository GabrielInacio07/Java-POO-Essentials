package Desafio.PO02;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(boolean status){
        if (status){
            System.out.println("O CACHORRO está LATINDO");
        }else{
            System.out.println("O CACHORRO está em silêncio");
        }
    }

    @Override
    public void attack(boolean status){
        if (status){
            System.out.println("O CACHORRO está MORDENDO");
        }else{
            System.out.println("O CACHORRO não está atacando");
        }
    }

}
