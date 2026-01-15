package Entity;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double converter(double dollarToReal, double dollarBought){
        double realPaid = dollarToReal * dollarBought;
        realPaid += realPaid * IOF;
        return realPaid;
    }

}
