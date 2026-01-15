import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int func, hora;
        double salarioHora, salario;

        func =  sc.nextInt();
        hora = sc.nextInt();
        salarioHora = sc.nextDouble();

        salario = (double) salarioHora * hora;
        System.out.println("NUMBER = "+25);
        System.out.println("SALARY = "+salario);
    }
}