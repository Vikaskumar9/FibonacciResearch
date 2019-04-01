import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;


public class Fib_vikas {

    // initialized hashMap
    private ConcurrentHashMap<Integer, BigInteger> memoizeHashMap = new ConcurrentHashMap<>();
    {

        memoizeHashMap.put(0, BigInteger.ZERO);
        memoizeHashMap.put(1, BigInteger.ONE);
        memoizeHashMap.put(2, BigInteger.ONE);
    }

    /** This method takes two arguments. One is the key and the other is a functional interface,
     * which takes a key and, in turn, returns a value. The idea is, if the key exists in the map,
     * it will return the value. Otherwise, it will compute the value and add it the map and then return the value
     *
     *
     *
     * @param @int that take a int value as input .
     * @return return the value zero for
     *
     */

    protected BigInteger fib_vikas(int n) {
       if (n > 0) {
            return memoizeHashMap.computeIfAbsent(n,
                    (key) -> fib_vikas(n - 1).add(fib_vikas(n - 2)));
        } else {
            return  BigInteger.valueOf(0); // returning 0 when we se "-" negative number
        }

    }
    // I have hard coded 10000 in for loop, we can change thi value as needed, we could have change to take input as well
    // by using java scanner class. this method also check the time used by fib function and print it at the end.
    public static void main(String[] args) {
        Fib_vikas fibonacci_new = new Fib_vikas();
        for (int i = 0; i <= 100; i++) {
            long start = System.nanoTime();
            BigInteger temp = fibonacci_new.fib_vikas(i);
            long stop = System.nanoTime();
            long elapsedTime = stop - start;
            System.out.println("Fib number value of " + i + "=" + temp + " Total time in Nano Second=" + elapsedTime);

        }




    }
}
