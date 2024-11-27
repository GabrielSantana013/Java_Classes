package application;

import java.util.Scanner;

public class Program {

    public static void main(String[]args)
    {

        //Faça um programa que receba os 3 lados do triângulo x e y

        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB,yC;

        System.out.println("Digite os lados do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite os lados do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA+ xB + xC) /2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA+ yB + yC) /2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
