import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
