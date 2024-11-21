import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Enter lowerBound: ");
        int lowerBound = Integer.parseInt(scan.nextLine());
        System.out.println("Enter upperBound: ");
        int upperBound = Integer.parseInt(scan.nextLine());

        System.out.println(main.productRunningInt(lowerBound, upperBound));

    }

    long productRunningInt(int lowerBound, int upperBound) {
        long sum = 1;
        for (long i = lowerBound; i <= upperBound; i++) {
            sum *= i;
        }
        return sum;
    }


}