import java.util.Scanner;

public class Main {

    static int exponent(int base, int exp) {
        int product = 1;
        for (int i = 0; i < exp; i++) {
            product *= base;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the base: ");
        int base = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the exponent: ");
        int exp = Integer.parseInt(scan.nextLine());

        int result = exponent(base, exp);

        System.out.printf("%s raise to the power of %s is: %s ", base, exp, result);
    }
}