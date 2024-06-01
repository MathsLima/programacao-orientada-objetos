import java.io.*;
import java.util.*;

/**
 * PUCRS - Fundamentos de Programação
 * Prof. Daniel Callegari
 */
public class AppDistancias
{
    private static String[] vetNomesCidades;
    private static int[][] matDistanciasCidades;
    private static int nroCidades;
    
    public static void carregarDadosCidades ()
    {
        final String arqDados = "DNIT-Distancias.csv";
        final String separador = ";";
        int nroCidadesArquivo = -1;

        System.out.println("Carregando arquivo de cidades e distancias...");
        try
        {
            FileReader fileReader = new FileReader(arqDados);
            BufferedReader arq = new BufferedReader(fileReader);
            
            // lê a primeira linha e descobre nomes e quantidade de cidades
            String linha = arq.readLine();
            vetNomesCidades = linha.split(separador);
            nroCidades = vetNomesCidades.length;

            System.out.println(nroCidades + " cidades encontradas.");
            
            // aloca a matriz de distancias
            matDistanciasCidades = new int[nroCidades][nroCidades];
            
            // preenche a matriz de distancias lendo as proximas linhas do arquivo
            int indiceCidade = 0;
            while ((linha = arq.readLine()) != null)
            {
                //System.out.println("Lendo cidade " + indiceCidade);
                //System.out.println("linha lida: " + linha);
                String[] dists = linha.split(separador);
                
                if (dists.length > 0) {
                    for (int c=0; c<nroCidades; c++) {
                        matDistanciasCidades[indiceCidade][c] = Integer.parseInt(dists[c]);
                    }
                    indiceCidade++;
                }
            }
            arq.close();
            System.out.println("Arquivo de distâncias carregado com sucesso.");
            
        }
        catch (IOException e)
        {
            System.out.println("Erro ao carregar arquivo de distâncias.");
            System.out.println("Exceção : " + e);
            System.exit(1);
        }
        
    }
    
    public static void main (String[] args)
    {
        // DADOS DAS CIDADES
        // Os dados são carregados para as variaveis de escopo "global" :
        //   vetNomesCidades : vetor com os nomes das cidades (String)
        //   matDistanciasCidades : matriz de distancias entre as cidades (int)
        //   nroCidades : a quantidade de cidades disponíveis
        carregarDadosCidades();
      
    
        // Mostrar lista de cidades
        System.out.println("=== CIDADES DISPONIVEIS ===");
        for (int i=0; i<nroCidades; i++) {
            System.out.printf(" %2d. %s\n", i+1, vetNomesCidades[i]);
        }
        System.out.println("===========================");

        
        // Solicitar dados para a pesquisa
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o código da cidade de ORIGEM: ");
        int codCidadeOrigem = in.nextInt();
        System.out.print("Digite o código da cidade de DESTINO: ");
        int codCidadeDestino = in.nextInt();
        
        // Acessar dados das cidades escolhidas
        int indiceCidadeOrigem = codCidadeOrigem-1;
        int indiceCidadeDestino = codCidadeDestino-1;
        String nomeCidadeOrigem = vetNomesCidades[indiceCidadeOrigem];
        String nomeCidadeDestino = vetNomesCidades[indiceCidadeDestino];
        int distanciaCidades = matDistanciasCidades[indiceCidadeOrigem][indiceCidadeDestino];
        
        // Exibir os resultados
        System.out.printf("\nA distância entre %s e %s é de %d km.\n",
            nomeCidadeOrigem, nomeCidadeDestino, distanciaCidades);
                
        // Desafio:
        desafio();
        
        System.out.println("Fim do Programa.");
    }
    
    public static void desafio ()
    {
        /* Solicitar ao usuario uma lista de cidades separadas por vírgula:
         * Exemplo de entrada do usuário:
         *      15,7,4,2
         * O programa deverá identificar as cidades pelo código e depois
         * calcular e exibir a distancia total percorrida entre as cidades listadas.
         * Dica: utilize String.split() para processar a lista de cidades digitadas.
         */
        
    }

}
