public class Funcionario {

    private int anoContratacao;
    private String nomeCompleto;
    private double salario;

    public Funcionario(int ano, String nome, double sal) {
        this.anoContratacao = ano;
        this.nomeCompleto = nome;
        this.salario = sal;
    }

    public int getAnoContratacao() {
        return anoContratacao;
    }

    public String getNomeCompleto() {
        return nomeCompleto.toUpperCase();
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double novoSalario) {
        if (novoSalario > 0.0 && novoSalario > this.salario)
        {
            this.salario = novoSalario;
            return true;
        }
        else
        {
            return false;
        }
    }

}
