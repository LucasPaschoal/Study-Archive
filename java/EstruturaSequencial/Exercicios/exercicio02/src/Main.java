import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, pi, resultado;
        raio = sc.nextDouble();
        pi = 3.14159;
        resultado = pi * Math.pow(raio, 2);
        System.out.printf("%.4f",resultado);
    }
}