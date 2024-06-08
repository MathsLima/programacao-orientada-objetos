import java.util.*;
public class Cliente {
    private String cpf;
    private String nome;
    private List<SolicitacaoExame> solicitacoes;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        this.solicitacoes = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public List<SolicitacaoExame> getSolicitacoes() {
        return solicitacoes;
    }

    public void adicionarSolicitacao(SolicitacaoExame solicitacao){
        solicitacoes.add(solicitacao);
    }

    public double mediaValorSolic(){
        if(solicitacoes.isEmpty()){
            return 0.0;
        }

        double valor = 0;
        for(SolicitacaoExame solic : solicitacoes){
            valor += solic.valorExame();
        }
        return valor;
    }
}