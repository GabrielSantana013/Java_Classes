package application;

import java.util.Scanner;

public class ProgramMatriz {

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                matriz[i][j] = sc.nextInt();
            }
        }

        int wanted_number = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(matriz[i][j] == wanted_number)
                {
                    System.out.printf("Position %d,%d\n",i,j);
                    if(j>0)
                    {
                        System.out.printf("Left: %d\n",matriz[i][j-1]);
                    }
                    if(j<matriz[i].length-1)
                    {
                        System.out.printf("Right: %d\n", matriz[i][j+1]);
                    }
                    if(i<matriz.length-1)
                    {
                        System.out.printf("Down: %d\n", matriz[i+1][j]);
                    }
                    if(i>0)
                    {
                        System.out.printf("Up: %d\n", matriz[i-1][j]);
                    }

                }
            }
        }

        sc.close();
    }
}
