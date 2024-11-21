import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxDenominator = 10;
        System.out.println("Sum of Left to Right: " + sumLeftToRight(maxDenominator));
        System.out.println("Sum of Right to Left: " + sumRighttoLeft(maxDenominator));
    }

    // Test with float point values to check the difference for harmonic sum
    static Fraction sumLeftToRight(int maxDenominator) {
        Fraction sum = new Fraction(0, 1);
        for (int i = 1; i <= maxDenominator; i++) {
            Fraction fraction = new Fraction(1, i);
            sum = sum.addFraction(fraction);
        }
        return sum;
    }

    static Fraction sumRighttoLeft(int maxDenominator) {
        Fraction sum = new Fraction(0, 1);
        for (int i = maxDenominator; i >= 1; i--) {
            Fraction fraction = new Fraction(1, i);
            sum = sum.addFraction(fraction);
        }
        return sum;
    }


}