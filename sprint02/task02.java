class Solution2 {
    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int remainder = x % 10;
            x /= 10;
            if ((result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && remainder > 7)) ||
            (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && remainder < -8))) return 0;
            result = result * 10 + remainder;
        }
        return result;
    }
}
