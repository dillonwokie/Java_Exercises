public class Main {
    public static void main(String[] args) {
        int num = 3, maxNum = 20;
        int firstNum = 1, secondNum = 1;
        int fibNum;
        int sum = firstNum + secondNum;

        System.out.println("The first " + maxNum + " fibonacci numbers are:");
        System.out.print(firstNum + " " + secondNum + " ");

        while (num <= maxNum) {
            fibNum = firstNum + secondNum;
            System.out.print(fibNum + " ");
            ++num;

            secondNum = firstNum;
            firstNum = fibNum;
            sum += fibNum;
        }

        double average = (double) sum / maxNum;
        System.out.printf("%nThe average is " + average);
    }
}