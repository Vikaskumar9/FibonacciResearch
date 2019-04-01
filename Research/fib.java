//import java.util.*;
//import java.math.*;
//
//public class fib {
//    public static int getFibonacciNumberRecursively(int n) {
//        if(n == 0) return 0;
//        if(n == 1) return 1;
//        return getFibonacciNumberRecursively(n - 1) + getFibonacciNumberRecursively(n - 2);
//    }
//    public static HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//
//
//    public static int getFibonacciNumberBottomUpWithCache(int n) {
//        hm.put(0, 0);
//        hm.put(1, 1);
//        for(int i = 2; i <= n; i++) {
//            hm.put(i, hm.get(i - 1) + hm.get(i - 2));
//        }
//        return hm.get(n);
//    }
//    public static int getFibonacciNumberBottomUpWithoutCache(int n) {
//        int fnMin2 = 0;
//        int fnMin1 = 1;
//        int sum = 0;
//        for(int i = 2; i <= n; i++) {
//            sum = fnMin1 + fnMin2;
//            fnMin2 = fnMin1;
//            fnMin1 = sum;
//        }
//        return sum;
//    }
//
//    public static long fibonacci(int n) {
//        if (n <= 1) return n;
//        else return fibonacci(n-1) + fibonacci(n-2);
//    }
//
//    public static void main(String [] args) {
//        //long startTime = System.nanoTime();
//       // int n= getFibonacciNumberRecursively(24);
//       // long stopTime = System.nanoTime();
//       // System.out.println("result" + n);
//       // System.out.println(stopTime - startTime);
//       // int n= getFibonacciNumberRecursively(8); // 21
//
//       // long st1 = System.nanoTime();
//      //  getFibonacciNumberTopDown(24); //
//       // long st2 = System.nanoTime();
//       // System.out.println(st2 - st1);// 21
//
//        long st3 = System.nanoTime();
//        int n = getFibonacciNumberBottomUpWithCache(48); // 21
//        long st4 = System.nanoTime();
//        System.out.println("getFibonacciNumberBottomUpWithCache=" + n + "==" + String.valueOf(st4 - st3));// 21
//
//        long st5 = System.nanoTime();
//        int m = getFibonacciNumberBottomUpWithoutCache(48); // 21
//        //fibonacci(8);
//        //System.out.println("result" + m);
//        long st6 = System.nanoTime();
//        System.out.println("getFibonacciNumberBottomUpWithoutCache=" + m + "==" + String.valueOf(st6 - st5));// 2
//
//        long st8 = System.nanoTime();
//        long l = fib(48); // 21
//        //fibonacci(8);
//        //System.out.println("result" + m);
//        long st9 = System.nanoTime();
//        System.out.println("getFibonacciNumberBottomUpWithoutCache=" + l + "=="+  (st9 - st8));
//       // int x = 8;
//
//        //for (int i = 1; i <= n; i++) {
//          //  System.out.println(i + ": " + fibonacci(i));
//        //}
//
//    }
//
//    public static long fib(long n) {
//        float phi = (float)(Math.sqrt(5) + 1.0f)/2.0f;
//
//        return Math.round((Math.pow(phi,n) - (Math.pow(-phi, -n)))/Math.pow(5,0.5));
//    }
//}
