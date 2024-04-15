public class ClienteFisico extends Cliente{
    private double mensalidade;
    private int idade;
    private double salario;

    public ClienteFisico(String nome, int idade, double salario){
        super(nome);
        this.mensalidade = mensalidade;
        this.idade = idade;
        this.salario = salario;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getMensalidade(){
        if(idade < 60){
            return salario * 0.1;
        } else{
            return salario * 0.15;
        }
    }
}