
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addEntrega extends JDialog {
    private Transportadora transportadora;
    private JTextField textFieldDistancia;
    private JComboBox<Caminhao> comboBoxCaminhao;

    public addEntrega(Frame parent, Transportadora transportadora) {
        super(parent, "Adicionar Entrega", true);
        this.transportadora = transportadora;
        this.setLayout(new BorderLayout(10, 10));
        this.setSize(300, 200);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        //botao distancia
        panel.add(new JLabel("Distância:"));
        textFieldDistancia = new JTextField();
        panel.add(textFieldDistancia);

        //botao caminhao
        panel.add(new JLabel("Caminhão:"));
        comboBoxCaminhao = new JComboBox<>();
        for (Caminhao caminhao : transportadora.consultarCaminhaoes()) {
            comboBoxCaminhao.addItem(caminhao);
        }
        panel.add(comboBoxCaminhao);

        //botao adicionar com evento
        JButton addButton = new JButton("Adicionar");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double distancia = Double.parseDouble(textFieldDistancia.getText());
                    Caminhao caminhao = (Caminhao) comboBoxCaminhao.getSelectedItem();

                    Entrega entrega = new Entrega(distancia, caminhao);

                    transportadora.adicionarEntrega(entrega);
                    JOptionPane.showMessageDialog(addEntrega.this, "Entrega adicionada com sucesso!");
                    dispose();
                } catch (ExcessaoPersonalizada ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        //adiciona o painel
        add(panel, BorderLayout.CENTER);
        add(addButton, BorderLayout.SOUTH);
    }
}
