package application;

import entities.Employee;
import entities.OutSorcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int EmployeeNumber = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < EmployeeNumber; i++)
        {
            System.out.printf("Employee #%d data:\n", i+1);
            System.out.println("Outsorced? (y) (n)");
            char outsorced = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per Hour:");
            double valuePerHour = sc.nextDouble();
            if(outsorced == 'y')
            {
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSorcedEmployee(name,hours,valuePerHour,additionalCharge);
                list.add(emp);
            }
            else {

                Employee emp = new Employee(name,hours,valuePerHour);
                list.add(emp);
            }

        }

        System.out.println("Payments: ");

        for(Employee emp: list)
        {
            System.out.printf("%s - $%.2f \n",emp.getName(),emp.payment());
        }
        sc.close();
    }

}
