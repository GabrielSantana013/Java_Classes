package application;

import java.util.Scanner;
import util.ClientesPensionato;

public class ProgramPensionato {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many rooms will be rented?");
        int qtt_rooms = sc.nextInt();
        sc.nextLine();

        ClientesPensionato[] quartos = new ClientesPensionato[9];

        for(int i = 0; i < qtt_rooms; i++)
        {
            System.out.printf("Rent #%d:\n", i+1);
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();
            System.out.println("Room:");
            int room = sc.nextInt();
            sc.nextLine();

            quartos[room] = new ClientesPensionato(name,email,room);
        }

        System.out.println("Busy rooms:");
        for(ClientesPensionato alugueis: quartos)
        {
            if(alugueis == null)
                continue;
            System.out.printf("%s\n", alugueis.toString());
        }

        sc.close();
    }

}
