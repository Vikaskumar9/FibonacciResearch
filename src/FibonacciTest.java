import java.math.BigInteger;

public class FibonacciTest extends junit.framework.TestCase {


        Fibonacci fibonacci_new = new Fibonacci();


        /** Successful calls to fibonacci */
        public void testGood() {
            assertEquals(BigInteger.valueOf(1), fibonacci_new.fibonacci(1));
            assertEquals(BigInteger.valueOf(1), fibonacci_new.fibonacci(2));
            assertEquals(BigInteger.valueOf(1), fibonacci_new.fibonacci(2));
            assertEquals(BigInteger.valueOf(5), fibonacci_new.fibonacci(5));
            assertEquals(BigInteger.valueOf(5), fibonacci_new.fibonacci(5));
            assertEquals(BigInteger.valueOf(12586269025L), fibonacci_new.fibonacci(50));

        }

        /** Call to fibonacci that is too big */
        public void testHigh() {
            assertEquals(BigInteger.valueOf(7540113804746346429L), fibonacci_new.fibonacci(92));
        }


        /** Call to fibonacci that is small */
        public void testLow() {
            assertEquals(BigInteger.valueOf(0), fibonacci_new.fibonacci(0));

        }
        /** Call to fibonacci that is negative , we are returning 0 for negative input. */
        public void testNegativeLow() {
            assertEquals(BigInteger.valueOf(0), fibonacci_new.fibonacci(-10));
        }
    }


