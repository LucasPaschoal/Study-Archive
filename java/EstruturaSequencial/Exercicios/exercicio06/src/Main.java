import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

       float trianguloRet = (a * c) / 2;
       double circulo = 3.14159 * Math.pow(c,2);
       float trapezio = (a + b) * c / 2;
       float quad = b * b;
       float ret = a * b;

        System.out.printf("TRIANGULO: %.3f\n", trianguloRet);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPEIZIO: %.3f\n",trapezio);
        System.out.printf("QUADRADO: %.3f\n",quad);
        System.out.printf("RETANGULO: %.3f\n", ret);
    }
}