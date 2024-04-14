public class Produto {
    public String nome;
    public double precoCusto;

    public Produto(String nome, double precoCusto){
        this.nome = nome;
        this.precoCusto = precoCusto;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPrecoCusto(){
        return this.precoCusto;
    }
}
