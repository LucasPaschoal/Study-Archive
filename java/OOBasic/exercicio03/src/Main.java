import Entity.Studant;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Studant studant = new Studant();
        studant.setName(sc.nextLine());
        studant.setN1(sc.nextDouble());
        studant.setN2(sc.nextDouble());
        studant.setN3(sc.nextDouble());

        studant.passed();
    }
}