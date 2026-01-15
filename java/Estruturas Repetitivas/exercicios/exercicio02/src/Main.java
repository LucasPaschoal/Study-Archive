import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        while ( x != 0 || y != 0){
            if (x > 0 && y> 0) System.out.println("Primeiro Quadrante");
            if (x < 0 && y > 0) System.out.println("Segundo quadrante");
            if (x < 0 && y < 0) System.out.println("Terceiro quadrante");
            if (x > 0 && y < 0) System.out.println("Quarto quadrante");
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}