import java.util.*;
public class Lampada

{

    // ATRIBUTOS

    boolean ligada;

    boolean queimada;

    

    // METODOS

    public Lampada ()

    {

        this.ligada = false;

        this.queimada = false;

    }

    

    

    public void ligar ()

    {

        if (!queimada)

        {

            if (Math.random() < 0.3) // queimar?

            {

                 this.queimada = true;

                 this.desligar();

            }

        

            this.ligada = true;

        }

    }

    

    public void desligar ()

    {

        this.ligada = false;

    }



    public String getEstado ()

    {
        if (queimada) 

            return "QUEIMADA";

        else

            return ligada? "LIGADA" : "DESLIGADA";
    }



}