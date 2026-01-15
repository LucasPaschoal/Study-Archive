import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int [][]mat = new int[m][n];

        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int number = sc.nextInt();
        for (int i=0; i<mat.length;i++){
            for (int j=0; j<mat[i].length;j++){
                if (number == mat[i][j]) {
                    System.out.println("Position: "+i +","+j);
                    if (mat[i][j+1] != 0){
                        System.out.println("Right: "+mat[i][j+1]);
                    }
                }
            }
        }

        sc.close();
    }
}