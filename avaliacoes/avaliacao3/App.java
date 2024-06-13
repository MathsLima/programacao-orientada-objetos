import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // O laboratório e os exames que oferece
        Laboratorio lab = new Laboratorio();
        Exame exame1 = new Exame("HEMOG", "Hemograma", 10.0);
        Exame exame3 = new Exame("TGP", "Transaminase Glutâmico Pirúvica", 4.25);
        Exame exame2 = new Exame("TGO", "Transaminase Oxalacética ", 3.99);
        Exame exame4 = new Exame("TSH", "Hormônio Tireoestimulante ", 19.72);
        Exame exame5 = new Exame("GLIC", "Glicemia", 5.0);
        Exame exame6 = new Exame("CRTN", "Creatinina", 6.5);
        Exame exame7 = new Exame("UREA", "Ureia", 7.3);

        lab.adicionarExame(exame1);
        lab.adicionarExame(exame2);
        lab.adicionarExame(exame3);
        lab.adicionarExame(exame4);
        lab.adicionarExame(exame5);
        lab.adicionarExame(exame6);
        lab.adicionarExame(exame7);

        // Simulando cliente 1 e suas solicitacoes de exame
        Cliente cliente1 = new Cliente("1948141", "Maria Silva");

        SolicitacaoExame solicitacao1 = new SolicitacaoExame(2023, 12, 19401);
        solicitacao1.adicionarExame(exame1);
        solicitacao1.adicionarExame(exame2);

        SolicitacaoExame solicitacao2 = new SolicitacaoExame(2024, 4, 20511);
        solicitacao2.adicionarExame(exame1);
        solicitacao2.adicionarExame(exame4);

        cliente1.adicionarSolicitacao(solicitacao1);
        cliente1.adicionarSolicitacao(solicitacao2);

        lab.cadastraCliente(cliente1);


        // Cliente 2
        Cliente cliente2 = new Cliente("36587415", "Joao Silva");
        SolicitacaoExame solicitacao3 = new SolicitacaoExame(2022, 12, 19401);
        solicitacao3.adicionarExame(exame5);
        solicitacao3.adicionarExame(exame7);

        SolicitacaoExame solicitacao4 = new SolicitacaoExame(2022, 8, 25365);
        solicitacao4.adicionarExame(exame4);

        cliente2.adicionarSolicitacao(solicitacao3);
        cliente2.adicionarSolicitacao(solicitacao4);

        lab.cadastraCliente(cliente2);


        // Cliente 3
        Cliente cliente3 = new Cliente("9852367", "Pedro Pereira");
        SolicitacaoExame solicitacao5 = new SolicitacaoExame(2019, 3, 98657);
        solicitacao5.adicionarExame(exame5);
        solicitacao5.adicionarExame(exame7);
        solicitacao5.adicionarExame(exame7);
        solicitacao5.adicionarExame(exame7);

        SolicitacaoExame solicitacao6 = new SolicitacaoExame(2024, 7, 25365);
        solicitacao6.adicionarExame(exame5);
        solicitacao6.adicionarExame(exame5);

        cliente3.adicionarSolicitacao(solicitacao5);
        cliente3.adicionarSolicitacao(solicitacao6);

        lab.cadastraCliente(cliente3);


        // Buscando dados do cliente 1
        Cliente c = lab.buscarCliente("1948141");
        System.out.println("\nT3 Matheus Lima - Laboratorio Exames");
        System.out.println("Dados do Cliente  1");
        System.out.println(c.getNome());

        // Buscar clientes que possuem "Silva" no nome imprimir o nome do cliente
        //e a média de valor das suas solicitações.
        System.out.println("\nCliente  com sobrenome Silva e suas medias de exames.");
        List<Cliente> clienteSilva = lab.buscarClientesPorNome("Silva");
        for (Cliente cliente : clienteSilva) {
            double somaValor = 0;
            int totalExames = 0;
            for(SolicitacaoExame solic : cliente.getSolicitacoes()) {
                for (Exame exame : solic.getExames()) {
                    somaValor += exame.getPrecoExame();
                    totalExames++;
                }
            }
            double mediaValor = somaValor/totalExames;
            String mediaValorFormatado = String.format("%.2f", mediaValor);
            System.out.println("Cliente: " + cliente.getNome() + " - R$ " + mediaValorFormatado);
        }

        //Buscar clientes que NÃO realizaram o exame "TSH".
        List<Cliente> clientesSemTSH = new ArrayList<>();
        for (Cliente cliente : lab.buscarClientesPorNome("")) {
            boolean realizouTSH = false;
            for (SolicitacaoExame solicitacao : cliente.getSolicitacoes()) {
                for (Exame exame : solicitacao.getExames()) {
                    if (exame.getCodigo().equals("TSH")) {
                        realizouTSH = true;
                        break;
                    }
                }
                if (realizouTSH) break;
            }
            if (!realizouTSH) clientesSemTSH.add(cliente);
        }
        for (Cliente cliente : clientesSemTSH) {
            System.out.println("\nCliente que não realizou TSH: " + cliente.getNome());
        }

        //lab.salvarDadosCliente(cliente1, "cliente1.txt");
        lab.dadosCliente(cliente1, "dados-cliente.txt");
    }
}
