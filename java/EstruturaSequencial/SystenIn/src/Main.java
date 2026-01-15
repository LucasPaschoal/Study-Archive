import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write one value:");
        char c = sc.nextLine().charAt(0);
        /*
        int a = sc.nextInt();
        String s = sc.next();
        double d = sc.nextDouble();
        float f = sc.nextFloat();
        char c = sc.next().charAt(0);
        */
        System.out.println("value write = "+c);
        String s = sc.nextLine();
        System.out.println("Valores digitados até a próxima linha: \n"+s);
        sc.close();
    }
}