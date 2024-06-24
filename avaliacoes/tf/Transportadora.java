import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    private List<Entrega> entregas;
    private List<Caminhao> caminhoes;

    public Transportadora() {
        entregas = new ArrayList<>();
        caminhoes = new ArrayList<>();
    }

    public void adicionarEntrega (Entrega entrega) throws ExcessaoPersonalizada {
        for (Entrega ent: entregas){
            if(ent.getId() == entrega.getId()){
                throw new ExcessaoPersonalizada("Id de entrega já existe.");
            }
        }
        entregas.add(entrega);
    }

    public void deletarEntrega (int id) throws ExcessaoPersonalizada {
        for (Entrega ent: entregas){
            entregas.removeIf(entrega -> ent.getId() == id);
        }
    }

    public Entrega consultarEntregaID (int id) throws ExcessaoPersonalizada {
        return entregas.stream()
                .filter(entrega -> entrega.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Entrega> consultarEntregas () {
        return new ArrayList<>(entregas);
    }

    public List<Caminhao> consultarCaminhaoes () {
        return caminhoes;
    }

    public double consultarValoresEntregas(){
        return entregas.stream()
                .mapToDouble(Entrega::calcularValorTotal)
                .sum();
    }

    public void adicionarCaminhao(Caminhao cam){
        caminhoes.add(cam);
    }
}