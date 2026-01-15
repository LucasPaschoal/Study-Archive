import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //tipos inteiros e números de bits referêntes a eles.
        byte by = 8;
        short sh= 16;
        int in = 32;
        long lo = 64;

        //tipos numéricos ponto flutuante.
        float fl = 32;
        double dou = 64;

        //character Unicode
        char ch = 16;
        //true or false
        boolean bo = true;

        //testes
        char a = '\u0061';
        byte b = 124;
        double d = 45.88989;
        System.out.println(a);
        System.out.printf("Valor = %.2f\n",d);
        //Locale é usado para mudar a linguagem padrão da aplicação
        Locale.setDefault(Locale.US);
        System.out.printf("Valor = %.2f\n",d);
    }
}