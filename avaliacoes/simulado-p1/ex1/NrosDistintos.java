package ex1;

public class NrosDistintos{
    private int[] numeros;
    private int quantidadeNrosDistintos = 0;

    public NrosDistintos(int tamanhoMax){
        this.quantidadeNrosDistintos = quantidadeNrosDistintos;
        this.numeros = new int[tamanhoMax];
    }

    public int getQuantidadeNrosDistintos(){
        return this.quantidadeNrosDistintos;
    }

    public boolean adicionar(int numero){
        if(numeros.length <= quantidadeNrosDistintos){
            numeros[quantidadeNrosDistintos] = numero;
            quantidadeNrosDistintos++;
            return true;
        } else{
            return false;
        }
    }

    public int getNro(int indice){
        return numeros[indice];
    }
}