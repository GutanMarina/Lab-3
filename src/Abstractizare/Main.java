package Abstractizare;

public class Main {
    public static void main(String args[]) {
        Euro myEuro = new Euro(1999, "Eur");
        Dolar myDolar = new Dolar();
        System.out.println(myEuro);

        System.out.println("Origin Country of Euro is: " + myEuro.displayOriginCountry());
        System.out.println("Origin Country of Dolar is:" + myDolar.displayOriginCountry());
        System.out.println("The equivalent of Euro in Leu Moldovenesc is: " + myEuro.displayValue() + "Lei");
        System.out.println("The equivalent of Dolar in Leu Moldovenesc us: " + myDolar.displayValue() + "Lei");
    }
}
