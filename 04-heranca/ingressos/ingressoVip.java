public class ingressoVip extends ingresso{
    public float valorAdicional;

    public ingressoVip(float valor, float valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public float valorTotal(){
        return valor + valorAdicional;
    }

    public String toString(){
        return "Valor ingresso Vip: " + valorTotal();
    } 
}