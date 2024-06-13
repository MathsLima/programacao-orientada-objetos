import java.util.*;

public class SolicitacaoExame {
    private int cont = 1000;
    private int numSolicitacao;
    private int ano;
    private int mes;
    private int crm;
    private List<Exame> exames;

    public SolicitacaoExame(int ano, int mes, int crm) {
        this.numSolicitacao = cont++;
        this.ano = ano;
        this.mes = mes;
        this.crm = crm;
        this.exames = new ArrayList<>();
    }

    public int getNumSolicitacao() {
        return numSolicitacao;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getCrm() {
        return crm;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void adicionarExame(Exame exm){
        exames.add(exm);
    }

    public double valorExame(){
        double valor = 0;
        for(Exame exm : exames){
            valor += exm.getPrecoExame();
        }
        return valor;
    }

    @Override
    public String toString() {
        return "SolicitacaoExame{" +
                ", numSolicitacao=" + numSolicitacao +
                ", ano=" + ano +
                ", mes=" + mes +
                ", crm=" + crm +
                '}';
    }
}