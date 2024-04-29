import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("E2");

        Revista revista1 = new Revista("O mundo da programação", "Daniel Callegari", 2023, "123.456", "mensal");
        Revista revista2 = new Revista("DB World", "DAC", 2021, "999.456", "anual");

        Livro livro1 = new Livro("Java for Everyone", "Donald", 2010, 193, "tecnico");
        Livro livro2 = new Livro("Alice in Downland", "Russki", 1925, 411, "romance");

        MaterialEspecial me1 = new MaterialEspecial("Estojo de madeira", "Nikola Tesla", 1952, "Estojo nro 1094-b");
        MaterialEspecial me2 = new MaterialEspecial("Pedra Preciosa", "Nikola Tesla", 1954, "Quartzo 2");


        ItemAcervo[] obras = { revista1, revista2, livro1, livro2, me1, me2 };


        Arrays.sort(obras);

        for (ItemAcervo obra : obras) {
            System.out.println(obra);
        }

        System.out.println("Digite o autor a procurar:");
        Scanner in = new Scanner(System.in);
        String nomeBuscar = "Daniel";
        System.out.println("== RESULTADOS DA BUSCA ==");
        for (ItemAcervo obra : obras) {
            if (obra.autorContains(nomeBuscar))
                System.out.println(obra);
        }
        System.out.println("=========================");


        Impressora impP32 = new Impressora();

        impP32.imprimir(livro1);
        impP32.imprimir(revista2);
        impP32.imprimir(revista1);
        System.out.println(impP32.getQtdImpressoes());


    }
}