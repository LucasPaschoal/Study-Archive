import Entity.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.println("How many dollar will be bought? ");
        double dollarBought = sc.nextDouble();

        double real = CurrencyConverter.converter(dollarPrice, dollarBought);
        System.out.printf("Amount to be paid in reais = %.2f",real);
    }
}