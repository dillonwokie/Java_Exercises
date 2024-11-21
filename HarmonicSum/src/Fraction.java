public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero ");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    // Method to simplify fraction
    private void simplify() {
        int gcd = gcd(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;

        // Handle negative denominators
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Method to obtain GCD from Euclidean Algorithm
    private int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    // Method to sum fractions
    public Fraction addFraction(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
