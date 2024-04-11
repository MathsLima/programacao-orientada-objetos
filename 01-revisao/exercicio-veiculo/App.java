public class App{
    public static void main(String args[]){
        if (args.length < 4) {
            System.out.println("Quantidade insuficiente de parâmetros");
            System.exit(0);
        }
        String pais = args[0];
        String codigo = args[1];
        double combustivel = Double.parseDouble(args[2]);
        double distancia = Double.parseDouble(args[3]);

        Placa p1 = new Placa(pais,codigo);
        
        Veiculo v = new Veiculo(p1, 70);
        System.out.println("Dados do veiculo antes de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.abastece(combustivel);
        System.out.println("Dados do veiculo depois de abastecer:");
        System.out.println(v);
        System.out.println("----------------");

        v.dirige(distancia);
        System.out.println("Dados do veiculo depois de percorrer 250Km:");
        System.out.println(v);
        System.out.println("----------------");
        }
}