public class Impressora {

    private int qtdImpressoes = 0;

    public void imprimir (Imprimivel coisaAImprimir)
    {
        qtdImpressoes++;
        coisaAImprimir.imprimir();
    }

    public int getQtdImpressoes() {
        return this.qtdImpressoes;
    }


}
