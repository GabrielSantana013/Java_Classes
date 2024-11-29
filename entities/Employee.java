package entities;

public class Employee {

    public String Name;
    public double GrossSalary, Tax;

    public double NetSalary()
    {
        return GrossSalary-Tax;
    }

    public void IncreaseSalary(double percentage)
    {
        this.GrossSalary += (GrossSalary*(percentage/100));
    }

    public String toString()
    {
        double salary = NetSalary();
        return Name + ", " + "$" + String.format("%.2f", salary);
    }


}