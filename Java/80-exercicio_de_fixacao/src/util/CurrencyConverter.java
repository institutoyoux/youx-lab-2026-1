package util;

public class CurrencyConverter {

    public static double corversor(double dolar, double compra) {
        double valor = dolar * compra;
        return valor + (valor * 6 / 100);
    }
}
