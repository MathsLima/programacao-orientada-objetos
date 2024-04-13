public class Passagem{

    public String cpf;
    public String nome;
    public String assento;
    public double custoPassagem;

    public Passagem(String cpf, String nome, String assento, double custoPassagem){
        this.nome = nome;
        this.cpf = cpf;
        this.assento = assento;
        this.custoPassagem = custoPassagem;
    }

    public double custoBagagem(int quantidade, int[] pesos){
        double custoTotal = 0;
        for(int peso : pesos){
            custoTotal += peso * 0.5;
        }
        return custoTotal;
    }

    public double defineAssento(String a){
        return 0.5;
    }
}