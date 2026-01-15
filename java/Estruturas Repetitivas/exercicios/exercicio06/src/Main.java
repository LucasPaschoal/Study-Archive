import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x,y,z;
        for (int i = 0; i < n; i++){
            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();
            double resultado = (x*2.00 + y*3.00 + z*5.00)/10;
            System.out.printf("%.1f",resultado);
        }

        sc.close();
    }
}