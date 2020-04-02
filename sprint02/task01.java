public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(121));
    }
}

class Solution {
    public static boolean isPalindrome(int x) {
        if (x % 10 == 0) {
            return x == 0;
        }
        int reverse = 0;
        while (reverse < x) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        return reverse == x || reverse / 10 == x;
    }
}
