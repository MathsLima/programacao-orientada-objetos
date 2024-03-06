/*Modele e implemente em Java a abstração do elemento geométrico círculo. Não utilize a
classe de desenho de círculo presente na API de classes da linguagem. Deseja-se que o círculo
possua informações de posicionamento no plano cartesiano (coordenadas não-negativas no
eixo X e Y) dados por um ponto central, além do raio associado. Deve ser possível calcular a área
do círculo, o comprimento da circunferência e mudar a posição do círculo. */

import java.util.Scanner;

public class Circulo {
    private double raio;
    private double x;
    private double y;

    // Construtor
    public Circulo(double raio, double x, double y) {
        this.raio = raio;
        this.x = x;
        this.y = y;
    }

    // Getter para o raio
    public double getRaio() {
        return raio;
    }

    // Getter para a posição x
    public double getX() {
        return x;
    }

    // Getter para a posição y
    public double getY() {
        return y;
    }

    // Setter para mudar a posição do círculo
    public void mudarPosicao(double novoX, double novoY) {
        this.x = novoX;
        this.y = novoY;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Método para calcular o comprimento da circunferência do círculo
    public double calcularComprimento() {
        return 2 * Math.PI * raio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o raio do círculo: ");
        double raio = scanner.nextDouble();

        System.out.println("Insira a posição X do círculo: ");
        double x = scanner.nextDouble();

        System.out.println("Insira a posição Y do círculo: ");
        double y = scanner.nextDouble();

        
        // Criando o objeto
        Circulo circulo = new Circulo(raio, x, y);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Comprimento da circunferência: " + circulo.calcularComprimento());
        System.out.println("Circulo esta na posição " + x + " em x e " + y + " em y");

        

        System.out.println("Digite 1 para mudar a posição e 0 para mantera a posição: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Insira a nova posição X do círculo: ");
                double novoX = scanner.nextDouble();
        
                System.out.println("Insira a nova posição Y do círculo: ");
                double novoY = scanner.nextDouble();
        
                circulo.mudarPosicao(novoX, novoY);
        
                System.out.println("Novas coordenadas do centro do círculo: (" + circulo.getX() + ", " + circulo.getY() + ")");
                
                break;
        
            default:
                System.out.println("Posição não foi alterada");
                break;
        }

        scanner.close();
    }
}
