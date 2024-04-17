public class vendedor extends Empregado{
    public double percentualComissao = 0.1;

    public vendedor(String nome, int salario){
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public double calcularSalario(){
        return salario + (salario * percentualComissao);
    }

    public String toString(){
        return "\n" + "Tipo: Vendedor" + "\n" + "Nome Empregado: " + nome + "\n" + "Salario base: " + salario + "\n" + 
        "Salario com Bonus: " + calcularSalario();
    }
}