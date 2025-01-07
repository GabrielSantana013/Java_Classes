package entities;

public class Company extends TaxPayer{

    int numberOfEmployees;

    public Company(){}

    public Company(String name, Double income, int numberOfEmployees) {
        super(name, income);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {

        if(numberOfEmployees <=14)
        {
            return getIncome()*0.16;
        }
        else
        {
            return getIncome() *0.14;
        }

    }
}
