import java.util.Arrays;

public class NumberChecker2 {

    public static void main(String[] args) {
        int number = 21;

        int count = countDigits(number);
        int[] digits = storeDigits(number);
        int sumOfDigits = sumOfDigits(digits);
        int sumOfSquares = sumOfSquaresOfDigits(digits);
        boolean isHarshad = isHarshadNumber(digits, number);
        int[][] digitFrequency = findDigitFrequency(digits);

        System.out.println("Count of digits: " + count);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println("Digit frequencies: ");
        for (int[] freq : digitFrequency) {
            System.out.println("Digit: " + freq[0] + ", Frequency: " + freq[1]);
        }
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  // 10 digits (0-9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // Store the digit
            frequency[i][1] = 0;  // Initialize frequency
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }
}
