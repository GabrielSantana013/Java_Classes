package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramTaxes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Tax payer #%d data:\n", i+1);
            System.out.println("Individual or Company? (i/c)");
            char stats = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Anual Income: ");
            double income = sc.nextDouble();

            if(stats == 'i')
            {
                System.out.println("Health Expenditures: ");
                double hExpenditures = sc.nextDouble();
                Individual person = new Individual(name,income,hExpenditures);
                list.add(person);
            }
            else
            {
                System.out.println("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                Company company = new Company(name,income,numberOfEmployees);
                list.add(company);
            }

        }

        System.out.println("Taxes paid: ");

        double totalTaxes = 0.0;

        for(TaxPayer tax: list)
        {
            System.out.printf("%s: %.2f\n",tax.getName(), tax.tax());
            totalTaxes+= tax.tax();
        }

        System.out.printf("TOTAL TAXES: %.2f", totalTaxes);
        sc.close();

    }

}
