public class MaterialEspecial extends ItemAcervo {
    private String descricao;

    public MaterialEspecial(String titulo, String autor, int anoPublicacao, String descricao) {
        super(titulo, autor, anoPublicacao);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return super.toString() +
                " >> Material Especial {" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
