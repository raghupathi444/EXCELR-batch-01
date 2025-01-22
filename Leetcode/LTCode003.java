package Leetcode;

public class LTCode003 {
    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, result = 0;
        while (i < n && s.charAt(i) == ' ') i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }

    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();
        System.out.println(solution.myAtoi("42"));
        System.out.println(solution.myAtoi("   -042"));
        System.out.println(solution.myAtoi("1337c0d3"));
        System.out.println(solution.myAtoi("0-1"));
        System.out.println(solution.myAtoi("words and 987"));
        System.out.println(solution.myAtoi("2147483648"));
        System.out.println(solution.myAtoi("-91283472332"));
    }
    
}
