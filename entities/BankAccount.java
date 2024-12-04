package entities;

public class BankAccount
{
    //Atributos
    private int account_number;
    private String name;
    private double balance;

    //Construtores

    public BankAccount(int account_number, String name, double initialDeposit)
    {
        this.account_number = account_number;
        this.name = name;
        deposit(initialDeposit);
    }

    public BankAccount(int account_number, String name)
    {
        this.account_number = account_number;
        this.name = name;
    }

    //Getters e Setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccount_number() {
        return account_number;
    }

    //Métodos
    public String toString()
    {
            return "Account "
                + account_number
                + ", Holder: "
                + name
                + ", Balance: $"
                + String.format("%.2f", getBalance())
                + "\n";
    }

    public void deposit(double value)
    {
        this.balance += value;
    }

    public void withdraw(double value)
    {
        this.balance -= value+5;
    }

}
