package application;

import java.util.Scanner;
import entities.Employee;

public class ProgramEmployeeSalary {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Name: ");
        employee.Name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.Tax = sc.nextDouble();

        System.out.printf("Employee: %s\n", employee.toString());

        System.out.println("Which percentage to increse the salary?");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);

        System.out.printf("Updated Data: %s", employee.toString());

        sc.close();

    }

}
