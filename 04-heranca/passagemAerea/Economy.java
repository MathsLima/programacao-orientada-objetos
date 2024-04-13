public class Economy extends Passagem{
    public Economy(String cpf, String nome, String assento, double custoPassagem){
        super(cpf, nome, assento, custoPassagem);
    }

    public double custoBagagem(int quantidade, int[] pesos){
        double custoTotal = super.custoBagagem(quantidade, pesos);
        custoTotal += quantidade * 10.0;
        return custoTotal;
    }

    public double calcularMilhas(){
        return custoPassagem * 0.2;
    }
}