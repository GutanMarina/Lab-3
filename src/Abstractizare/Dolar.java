package Abstractizare;

public class Dolar implements Currency2 {
    @Override
    public double displayValue() {
        return 17.92;
    }

    @Override
    public String displayOriginCountry() {
        return "United States of America";
    }
}
