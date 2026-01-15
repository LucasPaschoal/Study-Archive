//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    File file = new File("../text.txt");
    Scanner sc = null;
    try {
        sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }
    catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
    finally {
        if (sc != null){
            sc.close();
        }
    }
}
