package filme.PO;

import Calculadora.PO.Classificacao;

public class Episodio implements Classificacao {

    private int numero;
    private String nome;

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    private Serie serie;
    private int totalAvaliacao;


    @Override
    public int getClassificaco() {
        if(totalAvaliacao > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
