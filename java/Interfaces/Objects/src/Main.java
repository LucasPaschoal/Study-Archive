import entities.Circle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    double radius = sc.nextDouble();
    String color = "Blue";

    Circle c = new Circle(radius, color);
    double area = c.area();
    System.out.printf("%.2f", area);

    sc.close();
}
