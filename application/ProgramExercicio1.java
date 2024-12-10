package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramExercicio1 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter the department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter work Data:");
        System.out.println("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department((departmentName)));

        System.out.println("How many contracts for this worker?");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            System.out.printf("Enter contract # %d data", i);
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per Hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours):");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Name: %s\n",worker.getName());
        System.out.printf("Department: %s\n",worker.getDepartment().getName());
        System.out.printf("Income for %s: %.2f", monthAndYear, worker.income(year,month));

        sc.close();
    }
}
