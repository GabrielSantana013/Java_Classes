package application;

import java.util.Scanner;

public class ProgramMaiorPosicao {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = sc.nextInt();

        double vect[] = new double[n];

        for(int i = 0; i < vect.length; i++)
        {
            System.out.print("\nDigite um número: ");
            vect[i] = sc.nextDouble();
        }

        int maior_posicao = 0;

        for(int i = 1; i < vect.length; i++)
        {
            if(vect[i] > vect[i-1])
            maior_posicao = i;
        }
        System.out.printf("Maior valor = %.2f\n", vect[maior_posicao]);
        System.out.printf("Posicao do maior valor = %d", maior_posicao);

        sc.close();
    }
}
