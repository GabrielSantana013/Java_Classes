package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramExercicio3 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.printf("Name:");
        String name = sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY):");
        Date birthDate = sdf1.parse(sc.next());
        sc.nextLine();

        Client client = new Client(name, email, birthDate);
        System.out.println();

        System.out.println("Enter order data:");
        System.out.println("Status: ");
        OrderStatus ods1 = OrderStatus.valueOf(sc.next());
        sc.nextLine();

        Order order = new Order(new Date(), ods1, client);

        System.out.println("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Enter the #%d item data:\n", i+1);
            System.out.println("Product name:");
            String productName = sc.nextLine();
            System.out.println("Product price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Product product = new Product(productName, price);

            System.out.println("Quantity:");
            int quantity = sc.nextInt();
            sc.nextLine();

            OrderItem orderItem = new OrderItem(quantity, price, product);
            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println("Order Summary:");
        System.out.println(order);


        sc.close();
    }
}
