package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProgramScanner2 {

    public static void main(String[] args) {

        String path = "/home/gabas/IdeaProjects/Java_Classes/teste.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null)
            {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

}
