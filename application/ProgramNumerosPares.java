/*
*
* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
*
* */


package application;

import java.util.Scanner;

public class ProgramNumerosPares {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros serão digitados? ");
        int n = sc.nextInt();
        sc.nextLine();

        int vect[] = new int[n];

        for(int i = 0; i< vect.length; i++)
        {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        int qtt_Pares = 0;

        System.out.print("Numeros Pares = ");
        for(int i = 0; i< vect.length; i++)
        {
            if(vect[i] % 2 == 0)
            {
                System.out.printf("%d ", vect[i]);
                qtt_Pares++;
            }
        }

        System.out.printf("\nQuantidade de Pares: %d\n", qtt_Pares);
        sc.close();
    }
}
