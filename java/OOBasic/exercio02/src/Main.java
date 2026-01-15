import Entity.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("Name: ");
        emp.setName(sc.nextLine());
        System.out.println("Gross Salary: ");
        emp.setGrossSalary(sc.nextDouble());
        System.out.println("TAX: : ");
        emp.setTax(sc.nextDouble());

        emp.NetSalaray();

        System.out.println(emp);
        double percentage;
        System.out.println("Which percentage to increase salary? ");
        percentage = sc.nextDouble();

        emp.IncreaseSalary(percentage);
    }
}