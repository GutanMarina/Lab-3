package Abstractizare;

public class Euro extends Currency {
    public Euro(double yearEmission, String code) {
        super(yearEmission, code);
    }

    @Override
    public double displayValue() {
        return 19.48;
    }

    @Override
    public String displayOriginCountry() {
        return " European Union";
    }

    @Override
    public String toString() {
        return "Euro{" +
                "yearEmission=" + getYearEmission() +
                ", code='" + getCode() + '\'' +
                '}';
    }
}
