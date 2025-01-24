import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int num4 = sc.nextInt();
        
        int largest = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        System.out.println("The biggest number is: " + largest);
        sc.close();
    }
}
