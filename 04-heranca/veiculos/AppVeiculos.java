import java.util.*;
public class AppVeiculos{
    public static void main(String[] args){
        Carro carro1 = new Carro("BMW", "M2", 2024, "branco", 500000, "Gasolina", 2);
        Moto moto1 = new Moto("Honda", "CG", 2020, "azul", 25000, "Manual", 125);

        List<Veiculo> frotaVeiculos = new ArrayList<>();

        frotaVeiculos.add(carro1);
        frotaVeiculos.add(moto1);

        for(Veiculo veiculo : frotaVeiculos){
            System.out.println(veiculo);
        }
    }
}