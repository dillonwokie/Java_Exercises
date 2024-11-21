import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();

        System.out.println("Enter lowerbound:");
        int lowerBound = Integer.parseInt(scan.nextLine());

        System.out.println("Enter upperbound:");
        int upperBound = Integer.parseInt(scan.nextLine());

        System.out.println("The sum of " + lowerBound + " to " + upperBound + " is " + main.sumRunningInt(lowerBound, upperBound));
        System.out.println("The average is " + main.averageRunningInt(lowerBound, upperBound));
    }


    int sumRunningInt(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        return sum;
    }

    double averageRunningInt(int lowerBound, int upperBound) {
        return (double) (lowerBound + upperBound) / 2;
    }

}