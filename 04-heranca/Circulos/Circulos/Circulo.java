public class Circulo
{
    private double raio;
    
    public Circulo (double raio)
    {
        this.raio = raio;
    }
    
    public double getRaio()
    {
        return this.raio;
    }
    
    public double getArea ()
    {
        return Math.PI * raio * raio;
    }
    
    public String toString ()
    {
        return "Eu sou um circulo de raio " + raio;
    }

}
