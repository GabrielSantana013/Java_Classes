package application;

import java.util.Scanner;

public class ProgramAbaixoDaMedia {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double vect[] = new double[n];

        for(int i = 0; i < vect.length; i++)
        {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double media = 0.0;
        for(int i = 0; i < vect.length; i++)
        {
            media += vect[i];
        }
        media = media/vect.length;

        System.out.printf("Média do vetor: %.2f\n", media);

        System.out.println("Elementos abaixo da média: ");
        for(int i = 0; i < vect.length; i++)
        {
            if(vect[i] < media)
            {
                System.out.printf("%.2f\n", vect[i]);
            }
        }

        sc.close();
    }
}
