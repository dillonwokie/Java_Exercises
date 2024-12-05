import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int num = 15423;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (num > 0) {
            int digit = num % 10;
            numbers.add(digit);
            num /= 10;
        }

        for (int n : numbers) {
            System.out.print(n + " ");
        }


    }
}