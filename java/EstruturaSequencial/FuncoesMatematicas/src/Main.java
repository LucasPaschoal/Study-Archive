//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Math.sqrt(x); Raiz quadrada de x
        // Math.pow(x, y); X elevado a Y
        // Math.abs(x); Valor absoluto de X

        double x = 4.0;
        double y = -5.9;
        double z = 8.0;
        double r;

        r = Math.sqrt(x);
        System.out.println("Raiz quadrada de x = "+ r);

        r = Math.pow(z, x);
        System.out.println(z+" elevado a "+x+"= "+r);

        r = Math.abs(y);
        System.out.println("Valor absoluto de "+y+" = "+r);
    }
}