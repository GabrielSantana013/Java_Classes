/*
 * bytes => 1 byte (-128 a 127)
 * short => 2 bytes
 * int => 4 bits
 * long => 8 bits
 *
 *
 * float
 * double
 *
 * String (classe, não tipo primitivo)
 * char
 *
 * boolean
 *
 *
 * var numero = 10; // se usar var ela faz a tipagem automática da variável
 *
 *
 * */

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String original = "abcd EFGH ijkl MNOPEF";
        String so1 = original.toLowerCase();
        String so2 = original.toUpperCase();
        String so3 = original.trim(); //elimina os espaços no final da string
        String so4 = original.substring(2); //cria uma nova string do indice 2 pra frente
        String so5 = original.substring(2,5); //(começo, final)
        String so6 = original.replace('a','X');
        String so7 = original.replace("abc", "XXX");
        int i = original.indexOf("EF");
        int j = original.lastIndexOf("EF");
        String s = "batata maça limão";

        String[] vetor = s.split(" ");
        for(int h = 0; h < 3; h++)
        {
            System.out.printf("%s\n", vetor[h]);
        }

        System.out.println(original);
        System.out.println(so1);
        System.out.println(so2);
        System.out.println(so3);
        System.out.println(so4);
        System.out.println(so5);
        System.out.println(so6);
        System.out.println(so7);
        System.out.println(i);
        System.out.println(j);


        sc.close();
    }
}
