package application;

import java.util.Scanner;

import util.PessoasProblemaAlturas;

public class ProgramPessoaMaisVelha {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas você vai digitar?");
        int n = sc.nextInt();
        sc.nextLine();
        PessoasProblemaAlturas[] vect = new PessoasProblemaAlturas[n];

        for(int i = 0; i < vect.length; i++)
        {
            System.out.printf("Dados da %d pessoa: \n", i+1);
            System.out.println("Nome: ");
            String name = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            vect[i] = new PessoasProblemaAlturas(name, idade);
        }

        int posicao_maior_idade = 0, maior_idade = 0;
        for(int i = 0; i < vect.length; i++)
        {
            if(vect[i].getIdade() > maior_idade)
            {
                posicao_maior_idade = i;
                maior_idade = vect[i].getIdade();
            }
        }

        System.out.printf("Pessoa mais velha: %s", vect[posicao_maior_idade].getName());

        sc.close();
    }
}
