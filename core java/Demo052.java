import java.util.Scanner;

public class Demo052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Armstrong number : ");
        int num = sc.nextInt(), temp = num, sum = 0, digits = (int) Math.log10(num) + 1;

        while (num != 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }
        sc.close();

        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");
    }
}