package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program_Rectangle {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("Area = %.2f\n", rectangle.Area());
        System.out.printf("Perimeter = %.2f\n", rectangle.Perimeter());
        System.out.printf("Diagonal = %.2f\n", rectangle.Diagonal());

        sc.close();
    }

}
