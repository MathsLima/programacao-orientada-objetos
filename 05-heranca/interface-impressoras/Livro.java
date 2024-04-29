public class Livro extends ItemAcervo implements Imprimivel {
    private int nroPaginas;
    private String generoLiterario;

    public Livro(String titulo, String autor, int anoPublicacao, int nroPaginas, String generoLiterario) {
        super(titulo, autor, anoPublicacao);
        this.nroPaginas = nroPaginas;
        this.generoLiterario = generoLiterario;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    @Override
    public String toString() {
        return super.toString() +
                " >> Livro {" +
                "nroPaginas=" + nroPaginas +
                ", generoLiterario='" + generoLiterario + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo o livro " + this.getTitulo());
    }
}
