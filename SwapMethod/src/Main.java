import java.util.Arrays;

public class Main {

    static boolean swap(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        return true;
    }

    static int[] copyOf(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 5, 6};
        int[] arr3 = {2, 3, 4, 5, 6};
        int[] arr4 = {2, 3, 3};

        // Swap Method
        if (swap(arr1, arr2)) {
            System.out.println(Arrays.toString(arr1));
            System.out.println(Arrays.toString(arr2));
        } else {
            System.out.println("Unable to swap Arrays");
        }

        // CopyOf Method
        int[] arr5 = copyOf(arr1);
        System.out.println(Arrays.toString(arr5));
    }
}