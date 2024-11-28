package application;

import java.util.Scanner;
import entities.Triangle;
public class Program {

    public static void main(String[]args)
    {

        //Faça um programa que receba os 3 lados do triângulo x e y

        Scanner sc = new Scanner(System.in);

       Triangle x, y;

       x = new Triangle();
       y = new Triangle();

        System.out.println("Digite os lados do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triângulo X: %.2f\n", areaX);
        System.out.printf("Area do triângulo Y: %.2f\n", areaY);

        if(areaX>areaY)
        {
            System.out.println("Maior área = areaX");
        }
        else
        {
            System.out.println("Maior área = areaY");
        }

        sc.close();
    }
}
