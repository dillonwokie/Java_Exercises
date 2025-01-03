public class Main {

    static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Track total tests and passed tests for summary
        int totalTests = 0;
        int passedTests = 0;

        // Test Case 1: Normal array with element present
        int[] normalArray = {1, 2, 3, 4, 5};
        // Test searching for an element that exists in the middle
        totalTests++;
        boolean result = contains(normalArray, 3);
        boolean expected = true;
        if (result == expected) {
            System.out.println("Test 1 PASSED: Found 3 in middle of array");
            passedTests++;
        } else {
            System.out.println("Test 1 FAILED: Should have found 3 in array");
        }

        // Test Case 2: Normal array with element not present
        totalTests++;
        result = contains(normalArray, 7);
        expected = false;
        if (result == expected) {
            System.out.println("Test 2 PASSED: Correctly reported 7 not in array");
            passedTests++;
        } else {
            System.out.println("Test 2 FAILED: Should not have found 7 in array");
        }

        // Test Case 3: Empty array
        int[] emptyArray = {};
        totalTests++;
        result = contains(emptyArray, 1);
        expected = false;
        if (result == expected) {
            System.out.println("Test 3 PASSED: Correctly handled empty array");
            passedTests++;
        } else {
            System.out.println("Test 3 FAILED: Empty array should return false");
        }

        // Test Case 4: Array with single element (present)
        int[] singleArray = {42};
        totalTests++;
        result = contains(singleArray, 42);
        expected = true;
        if (result == expected) {
            System.out.println("Test 4 PASSED: Found element in single-element array");
            passedTests++;
        } else {
            System.out.println("Test 4 FAILED: Should have found element in single-element array");
        }

        // Test Case 5: Array with duplicate elements
        int[] duplicateArray = {1, 2, 2, 3, 4};
        totalTests++;
        result = contains(duplicateArray, 2);
        expected = true;
        if (result == expected) {
            System.out.println("Test 5 PASSED: Found element in array with duplicates");
            passedTests++;
        } else {
            System.out.println("Test 5 FAILED: Should have found duplicate element");
        }

        // Print summary of test results
        System.out.println("\nTest Summary:");
        System.out.println("Total tests run: " + totalTests);
        System.out.println("Tests passed: " + passedTests);
        System.out.println("Tests failed: " + (totalTests - passedTests));
    }
}