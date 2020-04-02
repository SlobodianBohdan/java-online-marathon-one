public class Main {
    public static void main(String[] args) {
      
          System.out.println(Solution.divide(10,3));
          System.out.println(Solution.divide(7,-3));

    }
}

class Solution {
    static int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }
        return sign * quotient;
    }
}
