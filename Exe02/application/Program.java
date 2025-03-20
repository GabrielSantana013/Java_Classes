package Exe02.application;

import Exe02.model.entities.Contract;
import Exe02.model.entities.Installment;
import Exe02.model.services.ContractService;
import Exe02.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.println("Numero:");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Data (dd/MM/yyyy):");
        LocalDate date = LocalDate.parse(sc.nextLine(), dt1);
        System.out.println("Valor do contrato:");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(number, date, contractValue);

        System.out.println("Entre com o número de parcelas");
        int installmentQuantity = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, installmentQuantity);

        System.out.println("Parcelas: ");
        for(Installment i : contract.getInstalments()){
            System.out.println(i);

        }

        sc.close();
    }

}
