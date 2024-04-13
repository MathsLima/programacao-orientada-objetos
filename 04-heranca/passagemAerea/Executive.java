public class Executive extends Passagem{
    public Executive(String cpf, String nome, String assento, double custoPassagem){
        super(cpf, nome, assento, custoPassagem);
    }

    public double custoBagagem(int quantidade, int[] pesos){
        int quantidadeComDesconto = Math.max(0, quantidade - 2);
        double custoTotal = super.custoBagagem(quantidade, pesos);
        if(quantidade > 2){
            custoTotal += (quantidade - 2) * 10.0;
        }
        return custoTotal;
    }

    public double calcularMilhas(){
        return custoPassagem * 0.1;
    }
}