public class Main {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(numberToWord(number));
    }

    static String numberToWordRec(int num, int[] values, String[] words) {
        for (int i = 0; i < values.length; i++) {
            if (num >= values[i]) {
                int quotient = num / values[i]; // Divide to handle larger groups
                System.out.println(quotient);
                int remainder = num % values[i]; // Find the leftover number
                System.out.println(remainder);

                // Recursive call for larger parts
                String result = "";
                if (values[i] >= 100) { // Handle one hundred and higher
                    result = numberToWordRec(quotient, values, words) + " " + words[i];
                    System.out.println("greater 100: " + result);
                } else {
                    result = words[i];
                    System.out.println("less 100: " + result);
                }

                // Append the remainder recursively if it's non-zero
                if (remainder > 0) {
                    return result + " " + numberToWordRec(remainder, values, words);
                } else {
                    return result;
                }
            }
        }
        return ""; // Base case when num is reduced to zero
    }

    static String numberToWord(int num) {
        if (num == 0) {
            return "ZERO";
        }

        // Numeric values extended for large numbers
        int[] values = {1000, 100, 90, 80, 70, 60, 50, 40, 30, 20,
                19, 18, 17, 16, 15, 14, 13, 12, 11, 10,
                9, 8, 7, 6, 5, 4, 3, 2, 1};
        String[] words = {"Thousand", "Hundred", "Ninety", "Eighty", "Seventy", "Sixty",
                "Fifty", "Forty", "Thirty", "Twenty",
                "Nineteen", "Eighteen", "Seventeen", "Sixteen", "Fifteen",
                "Fourteen", "Thirteen", "Twelve", "Eleven", "Ten",
                "Nine", "Eight", "Seven", "Six", "Five", "Four",
                "Three", "Two", "One"};

        return numberToWordRec(num, values, words).trim();
    }
}
