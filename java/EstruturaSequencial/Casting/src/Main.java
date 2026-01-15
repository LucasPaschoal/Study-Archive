//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a, b ,c;
        a = 2;
        b = 3;
        c = 3;

        //É usado casting para que o valor da conta de números inteiros seja convertido para double nessa variável.
        //Assim estou garantindo que o valor a ser recebido será do tipo double.
        double resultado = (double) (a + b) * c / 2;
        System.out.println("resultado = "+resultado);
    }
}