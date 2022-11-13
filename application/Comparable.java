package aula4.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        String path = "D:\\MeusCodigos\\Java\\Interfaces\\src\\aula4\\assets\\names.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // LENDO O ARQUIVO
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }

            // ORDENANDO UMA COLEÇÃO
            Collections.sort(list);

            // PRINTANDO CADA VALOR DA LISTA
            for (String s : list) {
                System.out.println(s);
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}