
class Solution {
    static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == 1){
            return Integer.MIN_VALUE;}
        else if (dividend== Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        long quotient = 0;
        long dividend2 = dividend;
        long divisor2 = divisor;

        if (dividend2 < 0) {
            dividend2 = -dividend2;
        }
        if (divisor2 < 0) {
            divisor2 = -divisor2;
        }

        while (dividend2 >= divisor2) {
            dividend2 -= divisor2;
            ++quotient;
        }

        long result = sign * quotient;

        return (int) result;
    }
}
