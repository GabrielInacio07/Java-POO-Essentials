package Desafio.PO01;

public class Carro {

    protected String nome;
    protected double[] precos = new double[3]; // preços de 3 anos

    public Carro(String nome){
        this.nome = nome;
    }

    public void setPrice(int anoIndex, double price){
        this.precos[anoIndex] = price;
    }

    public String getName(){
        return this.nome;
    }

    public double getAveragePrice(){
        double soma = 0;
        for(double p : precos){
            soma += p;
        }
        return soma / 3;
    }

    public double getMenorPreco(){
        double menor = precos[0];
        for(double p : precos){
            if(p < menor) menor = p;
        }
        return menor;
    }

    public double getMaiorPreco(){
        double maior = precos[0];
        for(double p : precos){
            if(p > maior) maior = p;
        }
        return maior;
    }
}
