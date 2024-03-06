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
    public void moverPara(double novoX, double novoY) {
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

        // Solicitar ao usuário que insira o raio do círculo
        System.out.println("Insira o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Solicitar ao usuário que insira a posição x do círculo
        System.out.println("Insira a posição X do círculo: ");
        double x = scanner.nextDouble();

        // Solicitar ao usuário que insira a posição y do círculo
        System.out.println("Insira a posição Y do círculo: ");
        double y = scanner.nextDouble();

        // Criando o círculo com os dados informados pelo usuário
        Circulo circulo = new Circulo(raio, x, y);

        // Calculando e imprimindo a área e o comprimento da circunferência
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Comprimento da circunferência: " + circulo.calcularComprimento());

        // Solicitar ao usuário que insira a nova posição do círculo
        System.out.println("Insira a nova posição X do círculo: ");
        double novoX = scanner.nextDouble();

        System.out.println("Insira a nova posição Y do círculo: ");
        double novoY = scanner.nextDouble();

        // Movendo o círculo para a nova posição
        circulo.moverPara(novoX, novoY);

        // Imprimindo a nova posição do círculo
        System.out.println("Novas coordenadas do centro do círculo: (" + circulo.getX() + ", " + circulo.getY() + ")");

        scanner.close();
    }
}
