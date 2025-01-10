package application;

import model.entities.Account;
import model.exceptions.BussinesException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter Account data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Holder: ");
        String name = sc.nextLine();
        System.out.println("Initial Balance: ");
        double initialBalance = sc.nextDouble();
        System.out.println("Withdraw Limit: ");
        double withdrawLimit = sc.nextDouble();
        Account account = new Account(number, name, initialBalance, withdrawLimit);

        System.out.println("Enter amount for withdraw:");
        double amount = sc.nextDouble();

        try{
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance());
        }
        catch(BussinesException e)
        {
            System.out.printf("%s\n",e.getMessage());
        }
        sc.close();
    }
}
