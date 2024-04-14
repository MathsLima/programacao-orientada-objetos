public class ProdutoPerecivel extends Produto {

    public String dataFabricação;
    public String dataValidade;
    public double margem = 1.1;
    public int codigoFicalizacao;


    public ProdutoPerecivel(String nome, double precoCusto, String dataFabricação, String dataValidade, int codigoFicalizacao){
        super(nome, precoCusto);
        this.dataFabricação = dataFabricação;
        this.dataValidade = dataValidade;
        this.codigoFicalizacao = codigoFicalizacao;
    }

    public double valorVenda(){
        double valorVenda = precoCusto + (precoCusto * margem);
        return valorVenda;
    }
}
