import java.io.*;
import java.nio.file.*;

public class ConversorTexto {
    
    public static void main(String[] args) {
        
        if (args.length != 2 ) {
            mostrarAjuda();
        } else {
            String arqEntrada = args[0];
            String arqSaida = args[1];
            converterArquivo(arqEntrada, arqSaida);
        }
    }

    private static void converterArquivo(String arqEntrada, String arqSaida) {
        System.out.println("Processando...");
        int qtdLinhasProcessadas = 0;
        long qtdCaracteresProcessados = 0;

        try (BufferedReader leitorArq = Files.newBufferedReader(Paths.get(arqEntrada))) {
            PrintWriter gravadorArq = new PrintWriter(arqSaida);
                        
            String linhaLida = leitorArq.readLine();

            while(linhaLida != null) {
                gravadorArq.println(linhaLida.toUpperCase());
                qtdLinhasProcessadas++;
                qtdCaracteresProcessados += linhaLida.length();

                linhaLida = leitorArq.readLine();
            }

            gravadorArq.close();

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo " + arqEntrada);
        }


        System.out.println("Pronto.");
        System.out.printf("%d linhas processadas.\n", qtdLinhasProcessadas);
        System.out.printf("%d caracteres processados.\n", qtdCaracteresProcessados);

    }

    private static void mostrarAjuda() {
        System.out.println("ConversorTexto converte tudo para maiusculas.");
        System.out.println("Uso:\n\tjava ConversorTexto arqEntrada.txt arqSaida.txt");
    }
}