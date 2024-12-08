package application;

import util.Employees;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ProgramEmployees {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("How many employees will be rigistred?");
        int qtt_employees = sc.nextInt();
        sc.nextLine();

        List<Employees> list = new ArrayList<>();

        for(int i = 0; i < qtt_employees; i++)
        {
            System.out.printf("Employee %d\n", i+1);
            System.out.println("ID:");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Salary:");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employees employee = new Employees(ID, name, salary);
            list.add(employee);
        }

        System.out.println("Enter the employee id that will have salary increased:");
        int ID = sc.nextInt();
        sc.nextLine();

        Employees employee = list.stream().filter(x-> x.getID() == ID).findFirst().orElse(null);

        if(employee == null)
        {
            System.out.println("This ID doesn't exist.");
        }
        else
        {
            System.out.println("Enter the percentage:");
            double percentage = sc.nextDouble();
            sc.nextLine();
            employee.increaseSalary(percentage);
        }
        for(Employees func: list)
        {
            System.out.printf("%s\n", func.toString());
        }

        sc.close();
    }

}
