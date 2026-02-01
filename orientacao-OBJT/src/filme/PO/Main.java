import Calculadora.PO.Calculadora;
import Calculadora.PO.FiltroRecomendacao;
import filme.PO.Episodio;
import filme.PO.Film;
import filme.PO.Serie;

void main(String[] args) {


    Serie serie = new Serie("Vikings",2015,true,0,0,80);
    serie.evaluateTitle(10);
    serie.evaluateTitle(5);
    serie.evaluateTitle(7);
    serie.insertSerie(5,false,12,90);
    serie.showCatalog();

    Film filme = new Film("Django Livre",2012,true,0,0,180);
    Film filme2 = new Film("Bastardos Inglorios",2015,true,0,0,200);
    filme.evaluateTitle(10);

    filme.evaluateTitle(10);
    filme.evaluateTitle(10);

    filme.insertFilm("Quentin Tarantino","Jimmie Fox",true);
    filme.showCatalog();

    Calculadora calculator = new Calculadora();

    calculator.insertStreamingDuration(filme);
    calculator.insertStreamingDuration(filme2);
    calculator.insertStreamingDuration(serie);
    System.out.println("Tempo total de sua lista: " + calculator.calculationStreamingDuration());

    FiltroRecomendacao filtro = new FiltroRecomendacao();

    Episodio ep =  new Episodio();
    ep.setNumero(1);
    ep.setNome("RAGNAR");
    ep.setSerie(serie);
    ep.setTotalAvaliacao(300);

    filtro.filtra(filme);
    filtro.filtra(ep);


}