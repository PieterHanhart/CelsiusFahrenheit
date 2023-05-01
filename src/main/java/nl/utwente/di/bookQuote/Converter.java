package nl.utwente.di.bookQuote;

public class Converter {
    public double convert (String temp) {
        return (Integer.parseInt(temp) * 1.8) + 32;
    }
}
