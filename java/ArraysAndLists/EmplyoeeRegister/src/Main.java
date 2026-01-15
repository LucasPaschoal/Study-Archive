import model.Emplyoee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Emplyoee> list = new ArrayList<>();

        for (int i=0; i < n;i++){
            System.out.println("\nEmployee #"+(i+1)+": ");
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Emplyoee emp = new Emplyoee(id, name, salary);
            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        Integer id = sc.nextInt();
        Emplyoee emp = list.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This is not exist.");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            int posit = 0;
            for (int i=0;i<list.size();i++){
                if(list.get(i).getId().equals(id)){
                    posit = i;
                }
            }
            list.get(posit).increaseSalary(percentage);
        }

        System.out.println("\nList of employee: ");
        for (Emplyoee e: list){
            System.out.println(e.toString());
        }

    sc.close();
    }
}