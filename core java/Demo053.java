import java.util.Scanner;

public class Demo053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Strong Number : ");
        int num = sc.nextInt(), temp = num, sum = 0;

        while (num != 0) {
            int digit = num % 10, fact = 1;
            for (int i = 1; i <= digit; i++) fact *= i;
            sum += fact;
            num /= 10;
        }
        sc.close();

        System.out.println(temp == sum ? "Strong Number" : "Not Strong Number");
    }
}
