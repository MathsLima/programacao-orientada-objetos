public class gerente extends Empregado{
    public String dadosDepartamento;

    public gerente(String nome, int salario, String dadosDepartamento){
        super(nome, salario);
        this.dadosDepartamento = dadosDepartamento;
    }

    public String getDadosDepartamento(){
        return this.dadosDepartamento;
    }

    public void setDadosDepartamento(String dadosDepartamento){
        this.dadosDepartamento = dadosDepartamento;
    }

    public String toString(){
        return "\n"+ "Tipo: Gerente" + "\n" + "Nome Empregado: " + nome + "\n" + "Salario: " + salario + "\n" + 
        "Dados Departamento: " + dadosDepartamento;
    }
}