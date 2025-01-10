package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramHotel {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("Check-in date (dd/MM/yyyy)");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.printf("Reservation: %s\n", reservation);
            System.out.print("\nEnter data to update the reservation: \n");
            System.out.println("Check-in date (dd/MM/yyyy)");
            checkIn = sdf.parse(sc.next());
            System.out.println("Check-out date (dd/MM/yyyy)");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.printf("Reservation: %s", reservation);
        }
        catch(ParseException e)
        {
            System.out.println("Invalid date Format:");
        }
        catch(DomainException e)
        {
            System.out.printf("Error: %s\n",e.getMessage());
        }
        catch(RuntimeException e)
        {
            System.out.printf("Unexpected Error: %s\n", e.getMessage());
        }

        sc.close();
    }
}
