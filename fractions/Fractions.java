package org.example.fractions;

public class Fractions {
    int numerator;
    int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return "{" +
                numerator +
                "/" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fractions fractions)) return false;
        if ((getNumerator() / getDenominator()) == (fractions.getNumerator() / fractions.getDenominator())) return true;
        return getNumerator() == fractions.getNumerator();
    }

    @Override
    public int hashCode() {
        double result = (double) getNumerator() / getDenominator();
        result = 31 * result;
        return (int) result;
    }

    public Fractions(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
