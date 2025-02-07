public class Demo070 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 8, 11, 15, 17}; 
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true; 
    }
}
