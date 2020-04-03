
class Solution {
    static int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        int quotient = 0;

        if (dividend < 0) {
            dividend *= -1;
        }
        if (divisor < 0) {
            divisor *= -1;
        }
        
        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }

        int result = sign * quotient;
        int remainder = result % 10;
        if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7))
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8))
            return Integer.MIN_VALUE;
        return result;
    }
}
