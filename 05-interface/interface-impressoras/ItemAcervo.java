public abstract class ItemAcervo implements Comparable<ItemAcervo>{
    private static int contadorObras = 0;

    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public ItemAcervo(String titulo, String autor, int anoPublicacao) {
        contadorObras++;
        this.codigo = contadorObras;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean autorContains (String str) {
        return this.autor.contains(str);
    }

    @Override
    public String toString() {
        return "Obra Literaria: " +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao;
    }

    @Override
    public int compareTo(ItemAcervo outraObra) {
        return this.anoPublicacao - outraObra.getAnoPublicacao();


    }

}
