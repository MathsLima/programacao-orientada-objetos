public class App
{
   public static void main(String[] args){
       System.out.print("\f");
       System.out.print("Inicio");
       System.out.println("\n");
       
       
       Lustre lustre = new Lustre(10);
       
       lustre.ligar();
       
       boolean queimadas = lustre.temAlgumaLampadaQueimada();
       if (queimadas){
           System.out.println("Tem lampada queimada?");
           System.out.println("Sim. As lampadas queimadas são: ");
           
           for (Integer i : lustre.getIndicesQueimadas()){
               System.out.println(i);
           }
       } else {
           System.out.println("Não tem lampada queimada");
       }
       
    }
}
