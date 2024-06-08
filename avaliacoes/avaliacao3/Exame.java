public class Exame {
    private String codigo;
    private String nomeExame;
    private double precoExame;

    public Exame(String codigo, String nomeExame, double precoExame) throws Exception {
        if(codigo.length() < 3 || codigo.length() > 5 || codigo == null){
            throw new Exception("Codigo invalido.");
        }
        this.codigo = codigo;
        this.nomeExame = nomeExame;
        this.precoExame = precoExame;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public double getPrecoExame() {
        return precoExame;
    }

    @Override
    public String toString() {
        return "Exame{" +
                "codigo='" + codigo + '\'' +
                ", nomeExame='" + nomeExame + '\'' +
                ", precoExame=" + precoExame +
                '}';
    }
}