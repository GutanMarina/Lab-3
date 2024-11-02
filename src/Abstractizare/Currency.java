package Abstractizare;

public abstract class Currency {
    private double yearEmission;
    private String code;

    public Currency(double yearEmission, String code){
        this.yearEmission=yearEmission;
        this.code=code;

    }
    public double getYearEmission(){
        return yearEmission;
    }
    public String getCode(){
        return code;
    }
    public void setYearEmission(double yearEmission){
        this.yearEmission=yearEmission;
    }
    public void setCode(String code){
        this.code=code;
    }

    public abstract double displayValue();
    public abstract String displayOriginCountry();

    @Override
    public String toString() {
        return "Currency{" +
                "yearEmission=" + yearEmission +
                ", code='" + code + '\'' +
                '}';
    }
}
