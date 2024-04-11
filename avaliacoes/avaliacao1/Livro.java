public class Livro
{
    private String autor;
    private String titulo;
    private Capitulo[] capitulo;
    private int quantCapitulo;
    private int quantPaginas;
    
    public Livro(String titulo, String autor, int quantCapitulo, int quantPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.capitulo = new Capitulo[quantCapitulo];  //ao inves de passar quantCapitulo poderia passar o numero de capitulos que podem ser adicionados
        this.quantCapitulo = 0;
        this.quantPaginas = 0;
    }
    
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    
    public void adicionarCapitulo(String tituloCap, int pag){
        if (quantCapitulo < capitulo.length){
            capitulo[quantCapitulo] = new Capitulo(tituloCap, pag);
            quantCapitulo++;
        }
    }
    
    public Capitulo[] getCapitulo(){
        return capitulo;
    }
    
    public void imprimirCapitulo2(int indice) {
        if (indice >= 0 && indice < quantCapitulo) {
            System.out.println(capitulo[indice].getCapitulo());
        }
    }
    /* 
    public int getquantPaginas(){
        int total = 0;
        for(int capitulo = 0; quantCapitulo; capitulo++){
            total += capitulo.getquantPaginas();
            return total;
        }
    }
    */
}