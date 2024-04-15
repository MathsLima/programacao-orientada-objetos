public class CadastroCliente {
    private Cliente[] clientes;
    private int tamanho;

    public CadastroCliente(int capacidade) {
        this.clientes = new Cliente[capacidade];
        this.tamanho = 0;
    }

    public void adicionarCliente(Cliente cliente) {
        if (tamanho < clientes.length) {
            clientes[tamanho] = cliente;
            tamanho++;
        } else {
            System.out.println("Cadastro de clientes está cheio. Não é possível adicionar mais clientes.");
        }
    }

    public String listarClientes() {
        StringBuilder listaClientes = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            Cliente cliente = clientes[i];
            listaClientes.append("Nome: ").append(cliente.getNome()).append(", Mensalidade: R$").append(cliente.getMensalidade()).append("\n");
        }
        return listaClientes.toString();
    }
}
