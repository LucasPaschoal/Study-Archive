import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i=0;i<n;i++){
            sc.nextLine();
            System.out.println("Nome: ");
            nome[i] = sc.nextLine();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i=0;i<n;i++){
            sum += altura[i];
        }

        double avg = sum / n;
        System.out.printf("Altura média: %.2f", avg);

        int num = 0;
        for (int i=0;i<n;i++){
            if (idade[i] < 16 ) num++;
        }
        double numd = num;
        double pc = (numd * 100) / n;
        System.out.printf("Pessoas com menos de 16 anos: %.2f",pc);
        System.out.println("%");

        for (int i=0;i<n;i++){
            if (idade[i] < 16 ) System.out.println(nome[i]);
        }
    }
}