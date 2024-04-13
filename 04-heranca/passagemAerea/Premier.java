public class Premier extends Executive{

    public Premier(String cpf, String nome, String assento, double custoPassagem){
        super(cpf, nome, assento, custoPassagem);
    }

    public double custoBagagem(int quantidade, int[] pesos){
        double custoTotal = super.custoBagagem(quantidade, pesos) * 0.5;
        return custoTotal;
    }
}