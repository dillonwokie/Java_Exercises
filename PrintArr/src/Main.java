import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int numItems = Integer.parseInt(scan.nextLine());
        int[] items = new int[numItems];

        if (items.length > 0){
            System.out.println("Enter the value of all items (separated by space): ");
            String itemValues = scan.nextLine();
            String[] itemValuesArr = itemValues.split(" ");
            for (int i = 0; i < items.length; i++) {
                items[i] = Integer.parseInt(itemValuesArr[i]);
            }
        } else {
            throw new IllegalArgumentException("Size of array must be greater than 0!");
        }

        System.out.println("The values are: " + Arrays.toString(items));



    }
}