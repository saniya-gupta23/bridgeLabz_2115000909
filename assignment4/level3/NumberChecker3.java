import java.util.Arrays;

public class NumberChecker3 {

    public static void main(String[] args) {
        int number = 12321;

        int count = countDigits(number);
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        boolean areEqual = compareArrays(digits, reversedDigits);
        boolean isPalindrome = isPalindrome(digits);
        boolean isDuckNumber = isDuckNumber(digits);

        System.out.println("Count of digits: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: " + Arrays.toString(reversedDigits));
        System.out.println("Are digits equal to reversed digits: " + areEqual);
        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Is Duck Number: " + isDuckNumber);
    }

    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    public static int[] storeDigits(int number) {
        String numStr = Integer.toString(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}
