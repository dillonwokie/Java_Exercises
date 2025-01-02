import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numItems = Integer.parseInt(scan.nextLine());
        int[] items = new int[numItems];

        if (numItems > 0){
            System.out.println("Enter the value of all items (separated by space): ");
            String itemValues = scan.nextLine();
            String[] itemValuesArr = itemValues.split(" ");
            String star = "*";

            for (int i = 0; i < items.length ; i++) {
                int itemValue = Integer.parseInt(itemValuesArr[i]);
                System.out.printf("%d: %s(%d)\n", i, star.repeat(itemValue), itemValue );
            }

        } else {
            throw new IllegalArgumentException("Number of items must be greater than 0!");
        }



    }
}