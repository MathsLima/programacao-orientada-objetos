import java.util.*;

public class Laboratorio {
    private List<Exame> exames;
    private List<Cliente> clientes;

    public Laboratorio(){
        this.exames = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void adicionarExame(Exame exm){
        exames.add(exm);
    }

    public Exame buscarExame(String codigo){
        for(Exame exm : exames){
            if(exm.getCodigo().equals(codigo)){
                return exm;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente clt : clientes) {
            if (clt.getCpf().equals(cpf)) {
                return clt;
            }
        }
        return null;
    }

}
