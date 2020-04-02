
class Solution {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int result = 1, i = 1;

        while (i <= x) {
            result++;
            i =  result * result;
        }
        return result - 1;
    }
}
