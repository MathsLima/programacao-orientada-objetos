import java.util.*;

public class Entrega {
    private int cont = 0;
    private int id;
    private List<Carga> cargas;
    private double distancia;
    private Caminhao caminhao;

    public Entrega(int id, List<Carga> cargas, double distancia, Caminhao caminhao) {
        this.id = cont++;
        this.cargas = new ArrayList<>();
        this.distancia = distancia;
        this.caminhao = caminhao;
    }

    public int getId() {
        return id;
    }

    public void adicionarCarga(Carga carga) {
        cargas.add(carga);
    }

    public double calcularValorTotal() {
        return cargas.stream()
                .mapToDouble(Carga::getValor)
                .sum() * distancia;
    }
}