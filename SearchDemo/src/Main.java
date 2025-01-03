import java.util.Scanner;

public class Main {

    static int search(int[] array, int key) {
        if (array == null) {
            return -1;
        }

        int length = array.length;
        int index = 0;
        while (index < length) {
            if (array[index] == key) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of items:");
        int length = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the value of all items (separated by space):");
        String[] itemsStr = scan.nextLine().split(" ");
        int[] items = new int[itemsStr.length];
        for (int i = 0; i < itemsStr.length; i++) {
            items[i] = Integer.parseInt(itemsStr[i]);
        }

        System.out.println("Enter the search key: ");
        int key = Integer.parseInt(scan.nextLine());

        int index = search(items, key);
        if (index != -1) {
            System.out.println(key + " is found with index " + index);
        } else {
            System.out.println(key + " is not found");
        }
    }
}