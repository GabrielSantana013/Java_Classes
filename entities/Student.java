package entities;

public class Student {

    public double nota1, nota2, nota3, grade;
    public boolean approved;
    public String name;


    public double FinalGrade()
    {
        grade = nota1 + nota2 +nota3;
        return grade;
    }

    public void IsApproved(double grade)
    {
        if(grade<60)
        {
            System.out.printf("Failed\nMissing %.2f points", 60-grade);
        }
        else
        {
            System.out.println("Pass");
        }
    }


}
