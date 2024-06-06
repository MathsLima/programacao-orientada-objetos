public class App {
 public static void main(String[] args) {

    // O laboratório e os exames que oferece
    Laboratorio lab = new Laboratorio();
    Exame exame1 = new Exame("HEMOG", "Hemograma", 10.0);
    Exame exame2 = new Exame("TGO", "Transaminase Oxalacética ", 3.99);
    Exame exame3 = new Exame("TGP", "Transaminase Glutâmico Pirúvica", 4.25);
    Exame exame4 = new Exame("TSH", "Hormônio Tireoestimulante ", 19.72);

    // [A fazer] Você deve adicionar mais 3 exames ao laboratório
    // Simulando cliente 1 e suas solicitacoes de exame

    Cliente cliente1 = new Cliente("1948141", "Maria Silva");

    SolicitacaoExame solicitacao1 = new SolicitacaoExame(2023, 12, 19401);

    solicitacao1.adicionarExame(exame1);
    solicitacao1.adicionarExame(exame2);
    solicitacao1.adicionarExame(exame5);

    SolicitacaoExame solicitacao2 = new SolicitacaoExame(2024, 4, 20511);

    solicitacao1.adicionarExame(exame1);
    solicitacao1.adicionarExame(exame4);
    cliente1.adicionarSolicitacao(solicitacao1);
    cliente1.adicionarSolicitacao(solicitacao2);

    // [A fazer] Você deve pelo menos mais 2 clientes e suas solicitacoes de exame
    // Um deles deve ter sobrenome "Silva" e o outro não.
    // Buscando dados

    Cliente c = lab.buscarCliente("1948141");

    System.out.println(c.getNome());
    
    // [A fazer] Você deve buscar clientes que possuem "Silva" no nome
    // e imprimir o nome do cliente e a média de valor das suas solicitações.
    // [A fazer] Você deve buscar clientes que NÃO realizaram o exame "TSH".

    lab.salvarDadosCliente(cliente1, "cliente1.txt");
    // BOM TRABALHO!

 }
}