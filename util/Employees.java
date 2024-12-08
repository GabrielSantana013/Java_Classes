package util;

public class Employees {

    private int ID;
    private String name;
    private double Salary;

    public Employees(int ID, String name, double salary) {
        this.ID = ID;
        this.name = name;
        Salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public String toString() {
        return ID + ", " + name + ", " + Salary;
    }

    public void increaseSalary(double percentage)
    {
        this.Salary += this.getSalary() * (percentage/100);
    }

}
