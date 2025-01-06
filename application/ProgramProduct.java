package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramProduct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.println("Enter the number of products: ");
        int productNumber = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i <productNumber; i++)
        {
            System.out.printf("Product #%d data:\n", i+1);
            System.out.println("Common, used or imported? (c/u/i)");
            char productStatus = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            if(productStatus == 'i')
            {
                System.out.println("Customs Fee: ");
                double customsFee = sc.nextDouble();
                Product produto = new ImportedProduct(name,price,customsFee);
                list.add(produto);
            }
            else if (productStatus == 'u')
            {
                System.out.println("Manufacture date: (DD/MM/YYYY)");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product produto = new UsedProduct(name,price,date);
                list.add(produto);
            }
            else
            {
                Product produto = new Product(name,price);
                list.add(produto);
            }
        }

        System.out.println("Price Tags:");
        for(Product prod: list)
        {
            System.out.println(prod.priceTag());
        }
        sc.close();
    }

}
