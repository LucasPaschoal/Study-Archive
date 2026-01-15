package Entity;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public double NetSalaray(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        double calc = grossSalary * percentage / 100 + NetSalaray();
        System.out.println("Update data: "+ this.name + ", $ " + String.format("%.2f", calc));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Employee: " +
                name +
                ", $ " + NetSalaray();
    }

}
