import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double avg = 0;
        double[] vet1 = new double[n];

        for (int i = 0; i < n; i++ ){
            vet1[i] = sc.nextDouble();
            avg += vet1[i];
        }
        avg = avg/n;
        System.out.printf("The avarege is: %.2f",avg);
    }
}