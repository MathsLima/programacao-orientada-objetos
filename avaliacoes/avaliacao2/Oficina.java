public class Oficina extends Evento{
    public String mentor;
    public String descricao;
    public String atividade;
    public String listaTecnologia;
    
    public Oficina(int codigo, String titulo, String nomeProfessor, int numeroParticipantes,
    String mentor,String descricao, String atividade, String listaTecnologia){
        super(codigo, titulo, nomeProfessor, numeroParticipantes);
        this.mentor = mentor;
        this.descricao = descricao;
        this.atividade = atividade;
        this.listaTecnologia = listaTecnologia;    
    }
    
    public String toString() {
        return super.toString() + " | Descricao: " + descricao +
        " | Atividade: " + atividade + 
        " | Tecnologias: " + listaTecnologia;
    }
}
