import java.io.*;

class GFG
{

    // Fibonacci Series using
// memoized Recursion 
    static int fib(int n)
    {
        int []term = new int [1000];

        // base case
        if (n <= 1)
            return n;

        // if fib(n) has already
        // been computed we do not
        // do further recursive
        // calls and hence reduce
        // the number of repeated
        // work
        if (term[n] != 0)
            return term[n];

        else
        {

            // store the computed value
            // of fib(n) in an array
            // term at index n to so that
            // it does not needs to be
            // precomputed again
            term[n] = fib(n - 1) +
                    fib(n - 2);

            return term[n];
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int n = 40;
        System.out.println(fib(n));
    }
}

// This code is contributed by ajit