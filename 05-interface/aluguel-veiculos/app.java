import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class app {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        vehicle car = new vehicle(carModel);
        carRental cr = new carRental(start, finish, car);

        double basicPayment = 100.0;
        double tax = 20.0;
        invoice inv = new invoice(basicPayment, tax);

        cr.setInvoice(inv);

        System.out.println("Valor total do aluguel: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}