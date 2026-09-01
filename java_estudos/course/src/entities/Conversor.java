package entities;

public class Conversor {
    public static final double IOF = 6.0;
    public static double pagar(double dolar,double quant){
        double valor = dolar * quant;

        return valor += valor * IOF /100;
    }
}
