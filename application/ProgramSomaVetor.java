/*
* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
* */

package application;

import java.util.Scanner;

public class ProgramSomaVetor {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double vect[] = new double[n];

        for(int i = 0; i< vect.length; i++)
        {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        System.out.print("Valores = ");
        for(int i = 0; i< vect.length; i++)
        {
            System.out.printf("%.2f ", vect[i]);
            soma += vect[i];
        }

        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("Media = %.2f\n", soma/vect.length);


        sc.close();
    }

}
