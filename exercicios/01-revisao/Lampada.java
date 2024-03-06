/*) Desenvolva uma abstração de uma lâmpada, a qual pode ser ligada e desligada. Sabe-se que
a lâmpada pode queimar ao ser ligada com uma chance de 30%, e que uma vez queimada ela
não pode mais ser ligada ou desligada novamente. Deve ser possível observar o estado da
lâmpada (se desligada, ligada ou queimada). Dica: utilize o gerador de números aleatórios de
Java, classe Random, para sortear a chance de uma lâmpada queimar quando for ligada. */

public class Lampada{

    // ATRIBUTOS
    boolean ligada;
    boolean queimada;

    // METODOS
    public Lampada (){
        this.ligada = false;
        this.queimada = false;
    }

    public void ligar (){
        if (!queimada){
            if (Math.random() < 0.3) // queimar?
            {
                 this.queimada = true;

                 this.desligar();
            }
            this.ligada = true;
        }
    }

    public void desligar (){
        this.ligada = false;
    }

    public String getEstado (){
        if (queimada) 
            return "QUEIMADA";
        else
            return ligada? "LIGADA" : "DESLIGADA";
        }
}