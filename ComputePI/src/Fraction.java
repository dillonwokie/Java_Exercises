public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

    }

    // GCD using Euclidean Algorithm
    private int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator); // Automatically simplifies
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator); // Automatically simplifies
    }


    // Convert fraction to decimal
    public double toDecimal() {
        return (double) this.numerator / this.denominator;
    }

    // toString method for representation
    @Override
    public String toString() {
        return denominator == 1 ? String.valueOf(numerator) : numerator + "/" + denominator;
    }

    // Getters for numerator and denominator
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
