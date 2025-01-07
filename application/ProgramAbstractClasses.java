package application;

import Util.Circle;
import Util.Rectangle;
import Util.Shape;
import Util.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramAbstractClasses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i<n; i++)
        {
            System.out.printf("Shape #%d data:\n",i+1);
            System.out.println("Rectangle or Circle (r/c)?");
            char shape = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Color (BLACK/BLUE/RED) ");
            Color color = Color.valueOf(sc.next());
            if(shape == 'r')
            {
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                Rectangle rectangle = new Rectangle(color, width, height);
                list.add(rectangle);
            }
            else
            {
                System.out.println("Radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                list.add(circle);
            }
        }

        System.out.println("Shape Areas:");

        for(Shape figs: list)
        {
            System.out.printf("Area: %.2f\n", figs.area());
        }

        sc.close();
    }


}
