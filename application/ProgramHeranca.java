package application;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class ProgramHeranca {

    public static void main(String[] args) {

    Account acc = new Account(1001, "Gabas", 0.0);
    BussinesAccount bacc = new BussinesAccount(1002,"Maria",0.0,500.0);


    //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BussinesAccount(1003, "bob", 0.0, 1500.0);
        Account acc3 = new SavingsAccount(1004,"ana",0.0,0.01);

    //DOWNCASTING

        BussinesAccount acc4 = (BussinesAccount) acc2;
        acc4.loan(100);

        //BussinesAccount acc5 = (BussinesAccount)acc3; Vai dar merda pq o compilador n sabe
        //que o acc3 não é uma conta, e sim uma SavingsAccount.
        //Uma SavingsAccount é sempre uma conta, mas uma Conta não é uma SavingsAccount.

        //Solução
        if(acc3 instanceof  BussinesAccount)
        {
            BussinesAccount acc5 = (BussinesAccount)acc3;
            acc5.loan(200.0);
            System.out.println("loan!");
        }

        if(acc3 instanceof  SavingsAccount)
        {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }

}
