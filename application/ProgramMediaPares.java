package application;

import java.util.Scanner;

public class ProgramMediaPares {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();

        int vect[] = new int[n];

        int qtt_par = 0;
        for(int i = 0; i < vect.length; i++)
        {
            System.out.println("Digite um valor:");
            vect[i] = sc.nextInt();
        }

        double media = 0.0;
        for(int i = 0; i < vect.length; i++)
        {
            if(vect[i] %2 == 0)
            {
                qtt_par ++;
                media += vect[i];
            }
        }

        if(qtt_par>0)
        {
            System.out.printf("Media dos pares = %.2f", (double)media/qtt_par);
        }
        else
        {
            System.out.println("Nenhum número par digitado.");
        }

        sc.close();
    }
}
