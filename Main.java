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

        String exemplo;
        System.out.println("Digite uma string: ");
        exemplo = sc.nextLine();
        System.out.printf("Voce digitou: %s\n", exemplo);


        int numero;
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        System.out.printf("Você digitou o numero %d\n", numero);

        char letra;
        System.out.println("Digite uma letra: ");
        letra = sc.next().charAt(0); //o charAt(0) pega só o primeiro elemento da string
        System.out.printf("Voce digitou a letra: %c\n", letra);

        double numeroDouble;
        System.out.println("Digite um float: ");
        numeroDouble = sc.nextDouble();
        System.out.printf("Voce digitou o numero: %.2f", numeroDouble);

        sc.close();
    }
}
