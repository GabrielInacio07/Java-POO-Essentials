package Desafio.PO04;

public class ConversorMoeda implements ConversaoFinanceira {

    private double dolar;

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

    public double getDolar(){
        return this.dolar;
    }

    @Override
    public double converterDolarParaReal(double dolar) {
        double cotacao = 5.64;
        return dolar * cotacao;
    }
}
