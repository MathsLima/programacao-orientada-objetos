import javax.swing.*;
import java.awt.*;


public class ConsultaEntrega extends JDialog {
    private Transportadora transportadora;
    private JList<Entrega> entregaList;
    private DefaultListModel<Entrega> entregaListModel;
    private JTextArea textAreaDetalhes;

    public ConsultaEntrega(Frame parent, Transportadora transportadora) {
        super(parent, "Consultar Entregas", true);
        this.transportadora = transportadora;

        setLayout(new BorderLayout(10, 10));
        setSize(600, 400);

        JPanel panel = new JPanel(new BorderLayout(10, 10));

        entregaListModel = new DefaultListModel<>();
        for (Entrega entrega : transportadora.consultarEntregas()) {
            entregaListModel.addElement(entrega);
        }

        entregaList = new JList<>(entregaListModel);
        entregaList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        entregaList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Entrega selectedEntrega = entregaList.getSelectedValue();
                if (selectedEntrega != null) {
                    mostrarDetalhesEntrega(selectedEntrega);
                }
            }
        });

        panel.add(new JScrollPane(entregaList), BorderLayout.CENTER);

        textAreaDetalhes = new JTextArea();
        textAreaDetalhes.setEditable(false);
        panel.add(new JScrollPane(textAreaDetalhes), BorderLayout.SOUTH);

        add(panel, BorderLayout.CENTER);

        JButton closeButton = new JButton("Fechar");
        closeButton.addActionListener(e -> dispose());
        add(closeButton, BorderLayout.SOUTH);
    }

    private void mostrarDetalhesEntrega(Entrega entrega) {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("ID: ").append(entrega.getId()).append("\n");
        detalhes.append("Distância: ").append(entrega.getDistancia()).append("\n");
        detalhes.append("Caminhão: ").append(entrega.getCaminhao()).append("\n");
        detalhes.append("Cargas:\n");


        //detalhes.append("Valor Total: ").append(entrega.calcularValorTotal()).append("\n");

        textAreaDetalhes.setText(detalhes.toString());
    }
}
