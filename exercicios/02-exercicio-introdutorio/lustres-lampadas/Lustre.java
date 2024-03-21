import java.util.*;
public class Lustre{
    
    //atributos
    private int numLampadas;
    private Lampada[] lampadas;

    //metodo 
    public Lustre(int numLampadas){
        int numLampadasACriar;
        
        if(numLampadas > 0){
            numLampadasACriar = numLampadas;
        } else {
            numLampadasACriar = 1;
        }
        
        System.out.printf("Criando um lustre com %d de lampadas. \n" , numLampadasACriar);  
    
        lampadas = new Lampada[numLampadasACriar];
        
        for(int indice=0; indice<lampadas.length; indice++){
            lampadas[indice] = new Lampada();
        }
    }

    public void ligar(){
        System.out.println("Lustre ligado");
        
        for(Lampada lamp : lampadas){
            lamp.ligar();
        }
    }
    
    public void desligar(){
        System.out.println("Lustre Desligado");
        
        for(Lampada lamp : lampadas){
            lamp.desligar();
        }
    }
    
    /**
     * método que retorna verdadeiro caso tenha alguma lâmpada queimada no
    lustre, e falso caso contrário.
     */
    public boolean temAlgumaLampadaQueimada(){
        boolean temAlgumaQueimada = false;
        
        for(Lampada lamp : lampadas){
            if(lamp.getEstado().equals("QUEIMADA")){
                temAlgumaQueimada = true;
            }
        }
        return temAlgumaQueimada;
    }
    
    /**
     * método que retorne uma coleção indicando a posição das lâmpadas
     * queimada. Você pode assumir que as posições do lustre são numeradas 
     * através de índices 0, 1, 2, etc.
     */
    public ArrayList<Integer> getIndicesQueimadas(){
        ArrayList<Integer> indices = new  ArrayList<Integer>();
         
        for(int indice=0; indice<lampadas.length; indice++){
            if(lampadas[indice].getEstado().equals("QUEIMADA")){
                indices.add(indice+1);
            }
        }
        
        return indices;
    }
    
    
}