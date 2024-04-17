public class Carro extends Veiculo{
    private String tipoCombustivel;
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, String cor, int preco, String tipoCombustivel, int numeroPortas){
        super(marca, modelo, ano, cor, preco);
        this.tipoCombustivel = tipoCombustivel;
        this.numeroPortas =  numeroPortas;
    }

    public String toString(){
        return super.toString() + " | Combus: " + tipoCombustivel + " | Num Portas: " + numeroPortas;
    }
}