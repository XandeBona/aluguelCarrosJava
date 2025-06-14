import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do alguel:");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada: ");
        LocalDateTime start = LocalDateTime.parse((sc.nextLine()), dtf);
        System.out.println("Retorno: ");
        LocalDateTime finish = LocalDateTime.parse((sc.nextLine()), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

    }
}
