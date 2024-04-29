public class Revista extends ItemAcervo implements Imprimivel {
    private String issn;
    private String peridiocidade;

    public Revista(String titulo, String autor, int anoPublicacao, String issn, String peridiocidade) {
        super(titulo, autor, anoPublicacao);
        this.issn = issn;
        this.peridiocidade = peridiocidade;
    }

    public String getIssn() {
        return issn;
    }

    public String getPeridiocidade() {
        return peridiocidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                " >> Revista {" +
                "issn='" + issn + '\'' +
                ", peridiocidade='" + peridiocidade + '\'' +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println("imprimindo a revista " + this.getTitulo());
    }
}
