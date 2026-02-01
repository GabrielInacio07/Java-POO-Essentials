package Calculadora.PO;

public class FiltroRecomendacao {

    private String recomendacao;

    public void filtra(Classificacao classificacao){
        if(classificacao.getClassificaco() >= 4){
            System.out.println("Recomendável");
        } else if (classificacao.getClassificaco() >=2) {
            System.out.println("Não é muito Recomendável");
        }else{
            System.out.println("Não é recomendavel");
        }
    }
}
