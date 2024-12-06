package application;

import java.util.Scanner;
import util.PessoasDadosPessoas;

public class ProgramDadosPessoas {

    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        PessoasDadosPessoas[] vect = new PessoasDadosPessoas[n];

        for(int i = 0; i < vect.length; i++)
        {
            System.out.printf("Dados da %d pessoa:\n",i+1);
            double altura = sc.nextDouble();
            sc.nextLine();
            char genero = sc.nextLine().charAt(0);
            vect[i] = new PessoasDadosPessoas(altura, genero);
        }

        int qtt_Homens = 0, qtt_Mulheres = 0;
        double media_altura_mulheres = 0.0, menor_Altura = 0.0, maior_Altura = 0.0;



        for(int i = 0; i < vect.length; i++)
        {
            if(i == 0)
            {
                menor_Altura = vect[i].getAltura();
                maior_Altura = vect[i].getAltura();
            }
            else
            {
                if (menor_Altura > vect[i].getAltura())
                {
                    menor_Altura = vect[i].getAltura();
                }

                if (maior_Altura < vect[i].getAltura())
                {
                    maior_Altura = vect[i].getAltura();
                }

            }
            if(vect[i].getGenero() == 'M')
            {
                qtt_Homens++;
            }
            if(vect[i].getGenero() == 'F')
            {
                media_altura_mulheres += vect[i].getAltura();
                qtt_Mulheres++;
            }
        }

        System.out.printf("Maior altura: %.2f\n", maior_Altura);
        System.out.printf("Menor altura: %.2f\n", menor_Altura);
        System.out.printf("Quantidade de homens: %d\n", qtt_Homens);
        System.out.printf("Media de altura das Mulheres: %.2f\n", media_altura_mulheres/qtt_Mulheres);

        sc.close();
    }

}
