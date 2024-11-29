package application;

import entities.Product;
import java.util.Scanner;

public class Program_Estoque {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price:");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock:");
        product.quantity = sc.nextInt();

        System.out.printf("Product Data: %s\n", product.toString());

        int quantityAdded;
        System.out.println("Enter the number of products to be added in stock: ");
        quantityAdded = sc.nextInt();
        product.addProducts(quantityAdded);

        System.out.printf("Updated Data: %s\n", product.toString());

        int quantityRemoved;
        System.out.println("Enter the number of products to be removed in stock: ");
        quantityRemoved = sc.nextInt();
        product.removeProducts(quantityRemoved);

        System.out.printf("Updated Data: %s\n", product.toString());

        sc.close();
    }

}
