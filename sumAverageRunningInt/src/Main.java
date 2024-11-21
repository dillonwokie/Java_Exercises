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
        System.out.println("The sum of even numbers from " + lowerBound + " to " + upperBound + " is " + main.sumOfEvenRunningInt(lowerBound, upperBound));
        System.out.println("The sum of odd numbers from " + lowerBound + " to " + upperBound + " is " + main.sumOfOddRunningInt(lowerBound, upperBound));
        System.out.println("The absolute difference of even and odd numbers from " + lowerBound + " to " + upperBound + " is " + main.absoluteDifference(lowerBound, upperBound));
        System.out.println("The squared sum of " + lowerBound + " to " + upperBound + " is " + main.sumOfSquares(lowerBound, upperBound));
        System.out.println("The average is " + main.averageRunningInt(lowerBound, upperBound));
    }


    int sumRunningInt(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += lowerBound++;
        }
        return sum;
    }

    int sumOfOddRunningInt(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 != 0) {
                sum += i++;
            }
        }
        return sum;
    }

    int sumOfEvenRunningInt(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (i % 2 == 0) {
                sum += i++;
            }
        }
        return sum;
    }

    int absoluteDifference(int lowerBound, int upperBound) {
        return Math.abs(sumOfEvenRunningInt(lowerBound, upperBound) - sumOfOddRunningInt(lowerBound, upperBound));
    }

    double averageRunningInt(int lowerBound, int upperBound) {
        return (double) (lowerBound + upperBound) / 2;
    }

    int sumOfSquares(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += (int) Math.pow(lowerBound++, 2);
        }
        return sum;
    }

}