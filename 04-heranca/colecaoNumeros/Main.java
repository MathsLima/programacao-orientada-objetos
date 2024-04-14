package ex1;
public class Main {
    public static void main(String[] args) {
        NrosDistintos meusNumeros = new NrosDistintos(10);
        meusNumeros.adicionar(20);
        meusNumeros.adicionar(40);
        meusNumeros.adicionar(16);
        meusNumeros.adicionar(20);
        

        System.out.printf("Existem %d numeros distintos na lista. \n", meusNumeros.getQuantidadeNrosDistintos());
        System.out.printf("A lista pode armazenar no maximo %d numeros distintos. \n", meusNumeros.getTamanhoMax());
        System.out.printf("A soma é %d. \n", meusNumeros.getSoma());
    }
}