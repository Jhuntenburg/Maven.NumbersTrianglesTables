package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static boolean isOdd(int n) {
        return (n % 2 != 0);
    }
    public static String getEvenNumbers(int start, int stop) {
        String ans = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                ans += i;
            }
        }

        return ans;
    }


    public static String getOddNumbers(int start, int stop) {
        String ans = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                ans += i;
            }
        }

        return ans;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String ans = "";
        for (int i = start; i < stop; i += step) {
            ans += i * i;
        }
        return ans;
    }

    public static String getRange(int stop) {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stop; i ++){
            sb.append(i);
        }
        return sb.toString();
    }

    public static String getRange(int start, int stop) {
        String ans = "";
        for (int i = start; i < stop; i ++){
            ans += i;
        }
        return ans;
    }


    public static String getRange(int start, int stop, int step) {
       return getExponentiations(start, stop,step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            sb.append ((int) Math.pow(i, exponent));
        }
        return sb.toString();
    }
}
