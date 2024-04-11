package ex1;

public class Main {
    public static void main(String[] args) {
        NrosDistintos meusNumeros = new NrosDistintos(10);
        meusNumeros.adicionar(20);
        meusNumeros.adicionar(40);
        meusNumeros.adicionar(16);
        meusNumeros.adicionar(20);
        System.out.println(meusNumeros);
    }
}
