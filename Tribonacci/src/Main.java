public class Main {
    public static void main(String[] args) {
        int num = 4, maxNum = 20;
        int tribNum;
        int firstNum = 1, secondNum = 1, thirdNum = 2;

        System.out.println("The first " + maxNum + " fibonacci numbers are:");
        System.out.print(firstNum + " " + secondNum + " " + thirdNum + " ");

        while (num < maxNum) {
            tribNum = firstNum + secondNum + thirdNum;
            System.out.print(tribNum + " ");
            ++num;

            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = tribNum;
        }
    }
}