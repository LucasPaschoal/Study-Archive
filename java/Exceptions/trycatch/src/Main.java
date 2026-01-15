//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    try {
        String[] vect = sc.nextLine().split(" ");
        int position = sc.nextInt();
        System.out.println(vect[position]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Invalid position!\n" + e.getMessage());;
    }
    catch (InputMismatchException e) {
        System.out.println("Invalid input!\n" + e.getMessage());;
    }
    System.out.println("End of program");

    sc.close();
}
