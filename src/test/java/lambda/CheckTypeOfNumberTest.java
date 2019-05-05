package lambda;

import lambda.CheckTypeOfNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckTypeOfNumberTest {

    private CheckTypeOfNumber checker = new CheckTypeOfNumber();

    @Test
    void checkCollectionTest_Prime() {
        Assertions.assertEquals("Prime", checker.check(2, 5));
        Assertions.assertEquals("Composite", checker.check(2, 12));
    }

    @Test
    void checkCollectionTest_Palindrome() {
        Assertions.assertEquals("Palindrome", checker.check(3, 898));
        Assertions.assertEquals("Not Palindrome", checker.check(3, 234));
    }

    @Test
    void checkCollectionTest_EvenOdd() {
        Assertions.assertEquals("Even", checker.check(1, 4));
        Assertions.assertEquals("Odd", checker.check(1, 3));
    }
}
