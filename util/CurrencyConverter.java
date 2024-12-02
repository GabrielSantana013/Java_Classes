package util;

public class CurrencyConverter {

    public static final double TAX = 1.06;

    public static double finalPrice(double dollar_price, double dollar_quantity)
    {
        return dollar_price*dollar_quantity * TAX;
    }

}
