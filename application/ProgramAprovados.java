package application;

import java.util.Scanner;
import util.Alunos;

public class ProgramAprovados {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados?");
        int n = sc.nextInt();
        sc.nextLine();

        Alunos vect[] = new Alunos[n];

        for(int i = 0; i < vect.length; i++)
        {
            System.out.printf("Digite o nome, nota 1 e nota 2 do %d aluno\n", i+1);
            String name = sc.nextLine();
            double n1 = sc.nextDouble();
            sc.nextLine();
            double n2 = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Alunos(name, n1,n2);
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < vect.length; i++)
        {
            if(vect[i].aprovado())
            {
                System.out.printf("%s\n", vect[i].getName());
            }
        }

        sc.close();
    }

}
