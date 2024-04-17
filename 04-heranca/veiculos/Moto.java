public class Moto extends Veiculo{
    private String tipoPartida;
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, String cor, int preco, String tipoPartida, int cilindradas){
        super(marca, modelo, ano, cor, preco);
        this.tipoPartida = tipoPartida;
        this.cilindradas =  cilindradas;
    }
    
    public String toString(){
        return super.toString() + " | Partida: " + tipoPartida + " | Cilindradas: " + cilindradas;
    }
}