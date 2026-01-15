import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0;
        int valor = sc.nextInt();

        while (valor != 4) {
            if (valor == 1) alcool += 1;
            if (valor == 2) gasolina += 1;
            if (valor == 3) diesel += 1;
           valor = sc.nextInt();
        }
        System.out.println("Muito Obrigado " +
                "\nAlcool: "+alcool +
                "\nGasolina: "+gasolina +
                "\nDiesel: "+diesel);

        sc.close();
    }
}