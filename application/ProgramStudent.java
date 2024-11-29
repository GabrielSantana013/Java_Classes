package application;

import java.util.Scanner;
import entities.Student;

public class ProgramStudent
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("Final Grade: %.2f\n", student.FinalGrade());
        student.IsApproved(student.FinalGrade());

        sc.close();
    }

}
