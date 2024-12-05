/*
* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
*/

package application;

import java.util.Scanner;

public class ProgramNegativos {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        do
        {
            System.out.println("Digite a quantidade de números de entrada (máximo 10)");
            n = sc.nextInt();
        }while(n > 10 || n <= 0);

        int vect[] = new int[n];

        for(int i = 0; i < vect.length; i++)
        {
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for(int i = 0; i < vect.length; i++)
        {
            if(vect[i] < 0)
            {
                System.out.printf("%d ", vect[i]);
            }
        }

        sc.close();
    }

}


