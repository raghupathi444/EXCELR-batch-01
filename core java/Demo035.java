import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println(num1 > num2 ? num1 + " is bigger" : num2 + " is bigger");
        
        sc.close();
    }
}
