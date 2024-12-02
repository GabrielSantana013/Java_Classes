/*
* Faça um programa para lera cotação do dolar e depois um valor em dolares a ser comprado por uma pessoa em reais
* Informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda que a pessoa pagará 6% de IOF sobre o
* valor do dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos
*
*
* Exemplo:
*
* What is the dollar price? "3.10"
* How many dollars will be bought? "200"
* Amount to be paid in reais = 657.20
*
*/

package application;

import java.util.Scanner;

import static util.CurrencyConverter.finalPrice;

public class Exercicio_Membros_Estaticos {

    public static void main(String[]args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollar_price = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        int dollars_quantity = sc.nextInt();

        double amount = finalPrice(dollar_price,dollars_quantity);

        System.out.printf("Amount to be paid in reais = %.2f", amount);

        sc.close();
    }

}
