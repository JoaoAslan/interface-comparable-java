package aula4.application;

import aula4.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "D:\\MeusCodigos\\Java\\Interfaces\\src\\aula4\\assets\\names.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // LENDO O ARQUIVO
            String employeeCSV = br.readLine();
            while (employeeCSV != null) {
                // RECORTANDO OS DADOS (0, 1)
                String[] fields = employeeCSV.split(",");
                String name = fields[0];
                Double salary = Double.parseDouble(fields[1]);

                list.add(new Employee(name, salary));

                employeeCSV = br.readLine();
            }

            /* ORDENANDO UMA COLEÇÃO
            Collections.sort(list);
            ERROR: pois a classe Employee não é um tipo Comparable!
            */

            // PRINTANDO CADA VALOR DA LISTA
            for (Employee emp : list) {
                System.out.println(emp);
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}