public class Capitulo
{
    private String capitulo;
    private int quantPaginas;
    
    public Capitulo(String capitulo, int quantPaginas){
        this.capitulo = capitulo;
        this.quantPaginas = quantPaginas;
    }
    
    public String getCapitulo(){return capitulo;}
    public int getquantPaginas(){return quantPaginas;}
}