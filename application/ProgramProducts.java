package application;

import model.entities.Product;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProducts {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter a file path: ");
        String entryPath = sc.nextLine();

        File sourceFile = new File(entryPath);
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "/out").mkdir();

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(entryPath))){

            String itemCsv = br.readLine();
            while(itemCsv != null)
            {
                String[]fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));
                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr)))
            {
                for(Product item: list)
                {
                    bw.write(item.toString());

                }
                System.out.println(targetFileStr + " CREATED!");
            }
            catch(IOException e)
            {
                System.out.printf("Error writing file: %s\n",e.getMessage());
            }

        }
        catch (IOException e) {
            System.out.printf("Error reading file: %s\n", e.getMessage());
        }
        sc.close();
    }
}
