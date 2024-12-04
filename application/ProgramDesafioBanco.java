package application;

import java.util.Scanner;
import entities.BankAccount;

public class ProgramDesafioBanco {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account number: ");
        int account_number = sc.nextInt();
        //limpando o buffer
        sc.nextLine();

        System.out.println("Enter Account Holder: ");
        String name = sc.nextLine();

        System.out.println("Is there a initial deposit? (y/n)");
        char initial_deposit = sc.nextLine().charAt(0);

        //declarando o objeto no escopo da main
        BankAccount account;

        if(initial_deposit == 'y' || initial_deposit == 'Y')
        {
            System.out.println("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            //instanciando
            account = new BankAccount(account_number, name, balance);
        }
        else
        {
            //instanciando
            account = new BankAccount(account_number, name);
        }

        System.out.printf("Account Data: \n%s", account);

        System.out.println("Enter a deposit value: ");
        double value = sc.nextDouble();
        account.deposit(value);
        System.out.printf("Account Data: \n%s", account);

        System.out.println("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);
        System.out.printf("Account Data: \n%s", account);


        sc.close();
    }
}
