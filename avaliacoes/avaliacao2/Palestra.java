public class Palestra extends Evento{
    public String nomePalestrante;
    public String tituloPalestra;
    public String biografia;
    
    public Palestra(int codigo, String titulo, String nomeProfessor, int numeroParticipantes, 
    String nomePalestrante, String tituloPalestra, String biografia){
        super(codigo, titulo, nomeProfessor, numeroParticipantes);
        this.nomePalestrante = nomePalestrante;
        this.tituloPalestra = tituloPalestra;
        this.biografia = biografia;
    }
    
    public String toString() {
        return super.toString() + " | Palestrante: " + nomePalestrante +
        " | Palestra: " + tituloPalestra + 
        " | Bio: " + biografia;
    }
}
