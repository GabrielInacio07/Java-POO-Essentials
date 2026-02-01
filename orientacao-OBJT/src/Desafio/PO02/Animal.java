package Desafio.PO02;

public class Animal {


    public void emitirSom(boolean status){
        if (status){
            System.out.println("O animal está emitindo som");
        }else{
            System.out.println("O animal está em silêncio");
        }
    }

    public void attack (boolean status){
        if (status){
            System.out.println("O animal está atacando");
        }else{
            System.out.println("O animal não está atacando");
        }
    }
}
