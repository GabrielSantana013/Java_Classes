package Exe03;

import Exe03.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        String path = "/home/gabas/IdeaProjects/Java_Classes/Exe03/nomes.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCsv = br.readLine();
            while(employeeCsv != null){
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for(Employee emp: list){
                System.out.println(emp.getName() + " " + emp.getSalary());
            }

        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }
    }

}
