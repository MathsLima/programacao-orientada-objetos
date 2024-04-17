public class Veiculo{
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public int preco;

    public Veiculo(String marca, String modelo, int ano, String cor, int preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public int getAno(){return this.ano;}
    public String getCor(){return this.cor;}
    public int getPreco(){return this.preco;}

    public String toString(){
        return "\n" + "Marca: " + marca + " | Modelo: " + modelo + 
        " | Ano: " + ano + " | Cor: " + cor + " | Preço: " + preco;
    }
}