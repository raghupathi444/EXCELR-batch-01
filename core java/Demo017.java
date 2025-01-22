class SumOf2Digits {
    public static int getSumOf2Digits(int n) {
        int fd = n / 10;  // First digit
        int ld = n % 10;  // Last digit
        int sum = fd + ld;
        return sum;
    }
}

public class Demo017 {
    public static void main(String[] args) {
        int n = 78;
        int sum = SumOf2Digits.getSumOf2Digits(n); // Direct static method call
        System.out.println("The sum of 2 digits is: " + sum);
    }
}
