import entities.Employee;
import entities.OutsourcedEmployee;

void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employees: ");
    int n = sc.nextInt();

    ArrayList<Employee> employees = new ArrayList<>();

    char outsourced;
    String name;
    int hours;
    Double valuePerHour;
    Double additionalCharge;

    for (int i = 0; i < n; i++){
        System.out.println("Outsource (y/n)?");
        outsourced = sc.next().charAt(0);
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Hours: ");
        hours = sc.nextInt();
        System.out.println("Value per hour: ");
        valuePerHour = sc.nextDouble();

        Employee emp;
        if (outsourced == 'y') {
            System.out.println("Additional charge: ");
            additionalCharge =  sc.nextDouble();
            emp = new OutsourcedEmployee(name, hours, valuePerHour,additionalCharge);
            employees.add(emp);
        } else {
            emp = new Employee(name, hours, valuePerHour);
            employees.add(emp);
        }
    }

    for (Employee emp : employees){
        System.out.println(emp.getName()+ " - $"+ String.format("%.2f", emp.payment()));
    }
}
