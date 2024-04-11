
public class CirculoColorido extends Circulo
{
    private String cor;
    
    public CirculoColorido (double raio, String cor)
    {
        super(raio);
        this.cor = cor;
    }
    
    public String toString ()
    {
        return super.toString() + ", de cor " + cor;
    }
    
}
