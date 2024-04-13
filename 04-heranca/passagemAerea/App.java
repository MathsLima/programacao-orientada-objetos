public class App{
    public static void main(String[] args){

        //passagem comum
        Passagem comum = new Passagem("123456789", "Matheus", "15A", 100);
        double custoBagagemPassagem = comum.custoBagagem(3, new int[]{10,15, 20});
        System.out.println("Custo total da bagagem comum: " + custoBagagemPassagem);
        System.out.println("\n");

        //
        Economy economica = new Economy("123456789", "Matheus", "15A", 100);
        double custoBagagemEconomica = economica.custoBagagem(3, new int[]{10,15, 20});
        System.out.println("Custo total da bagagem economica: " + custoBagagemEconomica);
        System.out.println("\n");
    
        //executiva
        Executive executiva = new Executive("123456789", "Matheus", "15A", 100);
        double custoBagagemExecutiva = executiva.custoBagagem(3, new int[]{10,15, 20});
        System.out.println("Custo total da bagagem executiva: " + custoBagagemExecutiva);
        double milhasExecutiva = executiva.calcularMilhas();
        System.out.println("Milhas da passagem executiva: " + milhasExecutiva); 
        System.out.println("\n");

        //premier
        Premier premier = new Premier("123456789", "Matheus", "15A", 100);
        double custoBagagemPremier = premier.custoBagagem(3, new int[]{10,15, 20});
        System.out.println("Custo total da bagagem premier: " + custoBagagemPremier);
        double milhasPremier = premier.calcularMilhas();
        System.out.println("Milhas da passagem premier: " + milhasPremier); 
        System.out.println("\n");
    }
}
