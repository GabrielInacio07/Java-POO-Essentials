package Calculadora.PO;


import filme.PO.Catalog;
import filme.PO.Serie;

public class Calculadora {

    private int tempTotal;


    public void insertStreamingDuration(Catalog catalogo){
        this.tempTotal += catalogo.getDuracaoEmMinutos();
    }

    public int calculationStreamingDuration(){
        return this.tempTotal;
    }


}
