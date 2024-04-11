import java.util.Scanner;


/**
 * Fundamentos de Programacao
 *
 * @author Daniel Callegari
 */
public class App
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("INICIO");
    
        Circulo c1 = new Circulo(80);
        System.out.println(c1);
        
        Circulo c2 = new Circulo(13.4);
        System.out.println(c2);
        
        CirculoColorido cCor1 = new CirculoColorido(12, "verde");
        System.out.println(cCor1);
        
        ////////////////// POLIMORFISMO ///////////////////
        Circulo meuCirculo = cCor1;
        System.out.println(meuCirculo);
        
        
        System.out.println("FIM");
    }
}
