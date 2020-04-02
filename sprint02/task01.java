//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

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
