import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];

        for (int i=0;i<n;i++){
            System.out.println("Altura da "+i+"a pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.println("Genero da "+i+"a pessoa: ");
            genero[i] = sc.next().charAt(0);
        }

        double menorAlt = altura[0];
        double maiorAlt = altura[0];
        for (int i=0;i<n;i++){
            if (menorAlt > altura[i]){
                menorAlt = altura[i];
            }
            if (maiorAlt < altura[i]){
                maiorAlt = altura[i];
            }
        }

        System.out.printf("Menor altura = %.2f \n", menorAlt);
        System.out.printf("Maior altura = %.2f \n", maiorAlt);

        double sum = 0;
        int mans = 0;
        int fam = 0;
        for (int i=0;i<n;i++){
            if(genero[i] == 'f' || genero[i] == 'F'){
                sum += altura[i];
                fam++;
            } else {
                mans++;
            }
        }
        double avg = sum / fam;
        System.out.printf("media de altura mulheres: %.2f \n",avg);
        System.out.println("Numero de homes = "+mans);
        sc.close();
    }
}