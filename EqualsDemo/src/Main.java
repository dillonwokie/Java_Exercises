public class Main {

    static boolean equals(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 1, 2, 3, 4};

        if (equals(arr1, arr2)) {
            System.out.println("Both arrays are similar");
        } else {
            System.out.println("The arrays are different from each other");
        }

        if (equals(arr1, arr3)) {
            System.out.println("Both arrays are similar");
        } else {
            System.out.println("The arrays are different from each other");
        }
    }
}