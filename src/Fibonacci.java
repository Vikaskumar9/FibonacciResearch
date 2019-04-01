import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * This's the class to generate the Fibonacci number.
 * I have java main with this class to test the output from the given number.
 * however, I have written a Junit test case to test the class.
 * Please check the Junit class called FibTest
 */
public class Fibonacci {


    /**
     * initialized hashMap
     */
    private Map<Integer, BigInteger> memoizeHashMap = new HashMap<>();
    {
        memoizeHashMap.put(0, BigInteger.ZERO);
        memoizeHashMap.put(1, BigInteger.ONE);
        memoizeHashMap.put(2, BigInteger.ONE);
    }

    /**
     * In this code, I have first checked if a Fibonacci number is already available in the memoizeHashMap or not.
     * If it is already available, I don't need to calculate, I get it using the key. Otherwise, I calculate.
     * note: the put() method replaces the value with a key if the key already exists in the map.
     * I also check for @param value to be greater then 0, else I return 0 for "0" or negative input.
     *
     * @param @int as input like 1,2,3,4,....
     * @return return either from map elese calculate and put the value in map.
     */


    protected BigInteger fibonacci(int n) {
        if (n > 0) {
            if (memoizeHashMap.containsKey(n)) {
                return memoizeHashMap.get(n);
            } else {
                BigInteger result = fibonacci(n - 1).add(fibonacci(n - 2));
                memoizeHashMap.put(n, result);
                return result;
            }
        } else {
            return BigInteger.valueOf(0);
        }
    }

         /**
         * I have hard coded 10000 in for loop, we can change this value as needed, we could have change to take input as well
         * by using java scanner class. this method also check the time used by fib function and print it at the end.
         *
         *
         * @param args
         */


        public static void main (String[]args){
            Fibonacci fibonacci_new = new Fibonacci();
            for (int i = 0; i <= 10000; i++) {
                long start = System.nanoTime();
                BigInteger temp = fibonacci_new.fibonacci(i);
                long stop = System.nanoTime();
                long elapsedTime = stop - start;
                System.out.println("Fib number value of " + i + "=" + temp + " Total time in Nano Second=" + elapsedTime);

            }
        }
    }
