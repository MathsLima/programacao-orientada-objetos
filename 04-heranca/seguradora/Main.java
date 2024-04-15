public class Main {
    public static void main(String[] args) {
        ClienteFisico cliente1 = new ClienteFisico("João", 35, 3000.0);
        ClienteFisico cliente2 = new ClienteFisico("Maria", 65, 4000.0);
        
        CadastroCliente cadastro = new CadastroCliente(5);
        
        cadastro.adicionarCliente(cliente1);
        cadastro.adicionarCliente(cliente2);
        
        System.out.println("Lista de Clientes:");
        System.out.println(cadastro.listarClientes());
    }
}
