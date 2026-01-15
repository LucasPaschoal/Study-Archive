import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        Product[] vect = new Product[n];

        for (int i=0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        for (int i=0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / 2.0;

        System.out.printf("Average price = %.2f", avg);

        sc.close();
    }
}