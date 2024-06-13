import java.io.*;
import java.util.*;

public class Laboratorio {
    private List<Exame> exames;
    private List<Cliente> clientes;

    public Laboratorio(){
        this.exames = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarExame(Exame exame) throws ExcessaoPersonalizada {
        for(Exame ex : exames){
            if(ex.getCodigo().equals(exame.getCodigo())){
                throw new ExcessaoPersonalizada("Exame " + exame.getCodigo() + " ja cadastrados.");

            }
        }
        exames.add(exame);
    }

    public void cadastraCliente(Cliente cliente) throws ExcessaoPersonalizada {
        for(Cliente c : clientes){
            if(c.getCpf().equals(cliente.getCpf())){
                throw new ExcessaoPersonalizada("Cpf " + cliente.getCpf() + " ja cadastrado.");
            }
        }
        clientes.add(cliente);
    }

    public Exame buscarExame(String codigo) throws ExcessaoPersonalizada {
        for(Exame exm : exames){
            if(exm.getCodigo().equals(codigo)){
                return exm;
            }
        }
        throw new ExcessaoPersonalizada("Exame nao encontrado.");
    }

    public Cliente buscarCliente(String cpf) throws ExcessaoPersonalizada {
        for(Cliente c : clientes){
            if(c.getCpf().equals(cpf)){
                return c;
            }
        }
        throw new ExcessaoPersonalizada("Cliente nao encontrado.");
    }

    public List<Cliente> buscarClientesPorNome(String sobrenome){
        List<Cliente> resultado = new ArrayList<>();
        for(Cliente c : clientes){
            if(c.getNome().contains(sobrenome)){
                resultado.add(c);
            }
        }
        return resultado;
    }

    public void dadosCliente(Cliente cliente, String path) throws  IOException{
        try (PrintWriter saida = new PrintWriter("dados-cliente.txt")) {
            saida.println("Laboratorio PUC-RS");
            saida.println("-------------------------------------");
            saida.println("Cliente CPF: " + cliente.getCpf() + ",  Nome: " + cliente.getNome());
            saida.println("-------------------------------------");

            for (SolicitacaoExame solic : cliente.getSolicitacoes()) {
                saida.println("Solicitacao de exame: " + solic.getNumSolicitacao() +
                        ", ano: " + solic.getAno() + ", mes: " + solic.getMes() +
                        ", CRM: " + solic.getCrm());



                for (Exame exm : solic.getExames()) {
                    saida.write("    Exame: " + exm.getNomeExame() + " - Código: " + exm.getCodigo()
                            + " - Preço: " + exm.getPrecoExame() + "\n");
                }
            }
        } catch (Exception e){
            System.out.println("Falha ao criar o arquivo!");
            e.printStackTrace();
        }

    }
}