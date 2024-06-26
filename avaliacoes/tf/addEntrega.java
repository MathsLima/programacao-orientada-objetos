import javax.swing.*;
import java.awt.*;

public class addEntrega extends JDialog {
    private Transportadora transportadora;

    public addEntrega(Frame owner, Transportadora transportadora) {
        super();
        this.transportadora = transportadora;
        iniciaUI();
    }

    private void iniciaUI() {
        this.setLayout(new GridLayout(4, 2, 10, 10));
        JLabel distanciaLabel = new JLabel("Distância:");
        JTextField distanciaField = new JTextField();

        JLabel caminhaoLabel = new JLabel("Caminhão (Placa):");
        JTextField caminhaoField = new JTextField();

        JLabel cargaLabel = new JLabel("Valor da Carga:");
        JTextField cargaField = new JTextField();

        JButton addButton = new JButton("Adicionar");

        setSize(300, 200);
        setLocationRelativeTo(null);


        this.setSize(300, 200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
