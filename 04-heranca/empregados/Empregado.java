public class Empregado{
    public String nome;
    public int salario;

    public Empregado(String nome, int salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public int getSalario(){
        return this.salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNome(int salario){
        this.salario = salario;
    }

    public String toString(){
        return "Nome Empregado: " + nome + "\n" + "Salario: " + salario;
    }
}