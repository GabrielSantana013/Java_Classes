package model.entities;

import model.exceptions.BussinesException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance, withdrawLimit;

    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(Double amount) throws BussinesException {
        validateAmount(amount);
        balance += amount;

    }
    public void withdraw(Double amount) throws BussinesException {
        validateAmount(amount);
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount) throws BussinesException {
        if(amount>getBalance())
        {
            throw new BussinesException("Error: amount cannot be greater than the amount in account");
        }
        if(amount > getWithdrawLimit())
        {
            throw new BussinesException("Error: amount exceeds account limit.");
        }
    }
    private void validateAmount(double amount) throws BussinesException
    {
        if(amount < 0)
        {
            throw new BussinesException("Error: amount needs to be positive");
        }
    }
}
