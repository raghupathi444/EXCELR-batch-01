import java.util.Scanner;

public class Demo048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int sum = sumOfDigits(num);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;  
            num /= 10;        
        }
        return sum;
    }
}
