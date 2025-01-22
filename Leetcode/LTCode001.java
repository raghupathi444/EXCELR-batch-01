package Leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        if (x == 0) {
            return true;
        }
        
        int original = x;
        int reversed = 0;
        
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        
        return reversed == original;
    }
}

public class LTCode001{
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 128;
        System.out.println(x + " is palindrome: " + s.isPalindrome(x)); 
    }
}
