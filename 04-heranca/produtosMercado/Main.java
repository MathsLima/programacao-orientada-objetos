public class Main{
    public static void main(String[] args){
        Produto produto = new Produto("batata", 5.99);
        System.out.println("Produto: " + produto.getNome() + "  Preco: " + produto.getPrecoCusto());

        ProdutoPerecivel perecivel = new ProdutoPerecivel("Tomate", 4.5, "01/01/2024", "02/02/2024", 123);
        double valorVenda = perecivel.valorVenda();
        System.out.println("Produto: " + perecivel.getNome() + "  Preco: " + perecivel.getPrecoCusto() + "  Valor de Venda: " + valorVenda);

    }
}