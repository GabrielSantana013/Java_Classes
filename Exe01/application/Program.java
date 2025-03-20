package Exe01.application;

import Exe01.model.entities.CarRental;
import Exe01.model.entities.Vehicle;
import Exe01.model.services.BrazilTaxServices;
import Exe01.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm)");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Retorno (dd/MM/yyyy hh:mm)");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start,finish, new Vehicle(carModel));

        System.out.println("Entre como preço por hora: ");
        double hourPrice = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double dailyPrice = sc.nextDouble();

        RentalService rentalService = new RentalService(dailyPrice, hourPrice, new BrazilTaxServices());

        rentalService.processInvoice(cr);

        System.out.println("Fatura: ");
        System.out.printf("Pagamento básico: %.2f\n", cr.getInvoice().getBasicPayment());
        System.out.printf("Imposto: %.2f\n", cr.getInvoice().getTax());
        System.out.printf("Pagamento total: %.2f\n", cr.getInvoice().getTotalPayment());
        
        sc.close();

        //teste commit 2

    }
}

