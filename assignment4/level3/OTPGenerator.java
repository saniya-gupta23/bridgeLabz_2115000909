import java.util.Arrays;

public class OTPGenerator {

    public static void main(String[] args) {
        int[] otpNumbers = new int[10];

        // Generate 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOTP();
        }

        // Display OTP numbers
        System.out.println("Generated OTP Numbers: " + Arrays.toString(otpNumbers));

        // Check if all OTPs are unique
        boolean areUnique = areOTPsUnique(otpNumbers);

        if (areUnique) {
            System.out.println("All OTP numbers are unique.");
        } else {
            System.out.println("There are duplicate OTP numbers.");
        }
    }

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;  // Generates a number between 100000 and 999999
    }

    // Method to ensure OTP numbers are unique
    public static boolean areOTPsUnique(int[] otpNumbers) {
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false;  // Duplicate OTP found
                }
            }
        }
        return true;  // All OTPs are unique
    }
}
