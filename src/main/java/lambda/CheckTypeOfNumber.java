package lambda;

import static com.google.common.math.IntMath.isPrime;

/**
 * Write the following methods that return a lambda expression performing a specified action:
 * <p>
 * PerformOperation isOdd(): The lambda expression must return
 * <p>
 * if a number is odd or
 * if it is even.
 * PerformOperation isPrime(): The lambda expression must return
 * if a number is prime or
 * if it is composite.
 * PerformOperation isPalindrome(): The lambda expression must return
 * if a number is a palindrome or if it is not.
 */
public class CheckTypeOfNumber {

    /**
     * The first integer specifies the condition to check for (1 for Odd/Even, 2 for Prime, 3 or for Palindrome).
     * The second integer denotes the number to be checked.
     */
    NumericTest checkTypeOf = (type, value) -> {
        if (type == 1) {
            return value % 2 == 0 ? "Even" : "Odd";
        } else if (type == 2) {
            return isPrime(value) ? "Prime" : "Composite";
        } else if (type == 3) {
            return isPalindrome(value) ? "Palindrome" : "Not Palindrome";
        } else {
            throw new IllegalArgumentException("Provided type does not exists");
        }
    };

    public String check(Integer type, Integer value){
        return checkTypeOf.check(type, value);
    }

    private boolean isPalindrome(Integer value) {
        String valueToCheck = value.toString();

        String reversed = new StringBuilder(valueToCheck).reverse().toString();
        return valueToCheck.equals(reversed);
    }

}
