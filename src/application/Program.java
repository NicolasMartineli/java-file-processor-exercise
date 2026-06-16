package application;

import entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter the file path: ");
        String path = sc.nextLine();
        File file = new File(path);

        String sourceFolderStr = file.getParent();
        File targetFolder = new File(sourceFolderStr + "\\out");
        targetFolder.mkdir();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                list.add(new Product(name, price, quantity));
                 line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
            for (Product item : list) {
                bw.write(item.getName() + ", " + item.total());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            sc.close();
        }

    }
}
