package application;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class ProgramHeranca {

    public static void main(String[] args) {


        Account acc1 = new Account(1001, "Gabas", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());
        
        Account acc2 = new SavingsAccount(1002, "Gabas2", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BussinesAccount(1003, "Gabas3", 1000.0, 200.0);
        acc3.withdraw(200.0);
        System.out.println(acc3.getBalance());
    }

}
