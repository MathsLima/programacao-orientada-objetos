//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CadastroFuncionariosOriginal cadastro = new CadastroFuncionariosOriginal();

        System.out.println(" ");

        System.out.println("Funcionarios com insalubridade e dependentes");
        System.out.println(cadastro.getInsalubridadeDependentes() + "\n");

        System.out.println(" ");
        System.out.println("Quantidade de funcionarios com dependetes");
        System.out.println(cadastro.quantidadeFuncionariosComDependentes());

        System.out.println(" ");
        System.out.println("Somatorio de salario bruto");
        System.out.println(cadastro.somatorioSalarioBruto());

        System.out.println(" ");
        System.out.println("Aumentado o salario de funcionarios insalubres");

        System.out.println(" ");
        System.out.println("Media salarial dos que nao tem insalubridade");
        System.out.println(cadastro.mediaSalarialDosQueNaoTemInsalubridade());
    }
}