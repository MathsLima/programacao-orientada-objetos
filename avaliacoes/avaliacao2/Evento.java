public class Evento
{
    public int codigo;
    public String titulo;
    public String nomeProfessor;
    public int numeroParticipantes;
    
    public Evento(int codigo, String titulo, String nomeProfessor, int numeroParticipantes){
        this.codigo = codigo;
        this.titulo = titulo;
        this.nomeProfessor = nomeProfessor;
        this.numeroParticipantes = numeroParticipantes;
    }

    public String toString() {
        return "Codigo: " + codigo + 
        " | Evento: " + titulo + 
        " | Prof organizador: " + nomeProfessor +
        " | Participantes: " + numeroParticipantes;
    }
}
