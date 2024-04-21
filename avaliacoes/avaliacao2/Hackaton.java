public class Hackaton extends Evento{
    public String mentor;
    public String descricao;
    public int quantAlunos;
    
    public Hackaton(int codigo, String titulo, String nomeProfessor, int numeroParticipantes, 
    String mentor, String descricao, int quantAlunos){
        super(codigo, titulo, nomeProfessor, numeroParticipantes);
        this.mentor = mentor;
        this.descricao = descricao;
        this.quantAlunos = quantAlunos;
    }

    public String toString() {
        return super.toString() + " | Mentor: " + mentor + 
        " | Descricao: " + descricao +
        " | Quant Alunos: " + quantAlunos;
    }
}
