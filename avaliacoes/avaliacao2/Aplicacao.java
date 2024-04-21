import java.util.*;
public class Aplicacao{
    public static void main(String[] args){
        System.out.println("\f");
        Palestra palestra1 = new Palestra(1, "Palestra", "Joao", 25, "Pedro", "Classes Abstratas", "Como fazer classes abstratas");
        Palestra palestra2 = new Palestra(2, "Palestra", "Maria", 60, "Ana", "Como ser Dev", "Como me tornei dev gringa");
        
        Oficina oficina1 = new Oficina(3, "Oficina", "Jose", 2, "Matheus", "Pilhas", "Codar", "Java");
        Oficina oficina2 = new Oficina(5, "Oficina", "Ana", 9, "Gabriela", "Rafaela", "Criar diagramas", "Astah");
        
        Hackaton hack1 = new Hackaton(5, "Hackaton", "Joao", 6, "Lucas", "Problem Solving", 6);
        Hackaton hack2 = new Hackaton(6, "Hackaton", "Joana", 7, "Renato", "Problem Solving", 7);
         
        List<Evento> listaEventos = new ArrayList<>();
        listaEventos.add(palestra1);
        listaEventos.add(palestra2);
        listaEventos.add(oficina1);
        listaEventos.add(oficina2);
        listaEventos.add(hack1);
        listaEventos.add(hack2);
        
        System.out.println("Lista de eventos:");
        for(Evento evento : listaEventos) {
            System.out.println(evento);
        }
    
        buscarEvento(listaEventos, "Java");
    }
    
    public static void buscarEvento(List<Evento> listaEventos, String termoBusca) {
        System.out.println("\nResultados da busca por '" + termoBusca + "':");
        for (Evento evento : listaEventos) {
            if (evento.toString().contains(termoBusca)){
                System.out.println(evento);
            }
        }
    }
}
