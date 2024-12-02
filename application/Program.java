package application;

import java.util.Scanner;

import static util.Calculator.*;

public class Program {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        double c = Circumference(radius);
        double v = Volume(radius);

        System.out.printf("Circunference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value %.4f", PI);

        sc.close();
    }


}
