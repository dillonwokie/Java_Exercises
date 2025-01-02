public class Main {

    public static String arrayToString(int[] array) {
        if (array == null) {
            return "null";
        }

        if (array.length == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length - 1; i++) {
            result.append(array[i]).append(", ");
        }
        result.append(array[array.length - 1]).append("]");

        return result.toString();
    }


    public static <T> String genericArrayToString(T[] array) {
        if (array == null) {
            return "null";
        }

        if (array.length == 0) {
            return "[]";
        }

        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length - 1; i++) {
            result.append(array[i] == null ? "null" : array[i].toString()).append(", ");
        }
        result.append(array[array.length - 1] == null ? "null" : array[array.length - 1].toString()).append("]");

        return result.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        String[] words = {"apple", "banana", "cherry", "durian", null};
        System.out.println(genericArrayToString(words));
        System.out.println(arrayToString(numbers));
    }
}