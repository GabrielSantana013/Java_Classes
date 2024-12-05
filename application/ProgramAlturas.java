/*
 Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
* */

package application;

import util.Pessoas;

import java.util.Scanner;

public class ProgramAlturas {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Pessoas[] vect = new Pessoas[n];

        for(int i = 0; i < vect.length; i++)
        {
            System.out.printf("Dados da %d pessoa\n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Pessoas(nome, idade, altura);
        }

        double altura_media = 0.0;
        int qtt_menores_de_16 = 0;
        for(int i = 0; i < vect.length; i++)
        {
            altura_media += vect[i].getAltura();
            if(vect[i].getIdade() < 16)
            {
                qtt_menores_de_16++;
            }
        }

        System.out.printf("Altura média: %.2f\n", altura_media/vect.length);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", (double) qtt_menores_de_16/ vect.length *100);

        for(int i = 0; i < vect.length; i++)
        {
            if(vect[i].getIdade() < 16)
            {
                System.out.printf("%s\n", vect[i].getNome());
            }
        }


        sc.close();

    }
}
