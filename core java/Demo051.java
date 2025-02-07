import java.util.Scanner;

public class Demo051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int reversenumber = 0, temp = number;

        while (number != 0) {
            reversenumber = reversenumber * 10 + number % 10;
            number /= 10;
        }
        sc.close();

        System.out.println(temp == reversenumber ? "Palindrome" : "Not Palindrome");
    }
}
