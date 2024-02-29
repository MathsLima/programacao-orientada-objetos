/*
Modele e implemente em Java a abstração do elemento geométrico círculo. Não utilize a
classe de desenho de círculo presente na API de classes da linguagem. Deseja-se que o círculo
possua informações de posicionamento no plano cartesiano (coordenadas não-negativas no
eixo X e Y) dados por um ponto central, além do raio associado. Deve ser possível calcular a área
do círculo, o comprimento da circunferência e mudar a posição do círculo
*/

import java.lang.Math;
import java.util.Scanner;

public class Circulo {
    private int raio;
    private int x;
    private int y;

    //construtor
    public Circulo(int raio, int x, int y){
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    //get
    public int getRaio(){
        return raio;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    // set
    public void mudarPosicao(int novoX, int novoY){
        this.x = novoX;
        this.y = novoY;
    }

    //calculos
    public double calcularArea(int raio){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia(int raio){
        return 2 * Math.PI * raio;
    }

    ///////
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
    }

}

