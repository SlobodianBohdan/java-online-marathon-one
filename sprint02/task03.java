
class Solution {
    static int divide(int dividend, int divisor) {
        int sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

        if (dividend < 0){
            dividend *= -1;
        }else if (divisor < 0){
            divisor *= -1;
        }

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            ++quotient;
        }
        return sign * quotient;
    }
}
