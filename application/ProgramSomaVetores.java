package application;

import java.util.Scanner;

public class ProgramSomaVetores {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos elementos vai ter cada vetor?");
        int n = sc.nextInt();

        int vect1[] = new int[n];
        int vect2[] = new int[n];
        int vect3[] = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for(int i = 0; i < vect1.length; i++)
        {
            vect1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for(int i = 0; i < vect1.length; i++)
        {
            vect2[i] = sc.nextInt();
        }

        System.out.println("Vetor Resultante: ");
        for(int i = 0; i < vect1.length; i++)
        {
            vect3[i] = vect1[i] + vect2[i];
            System.out.printf("%d\n", vect3[i]);
        }

        sc.close();
    }
}
