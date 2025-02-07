import java.util.Scanner;

public class Demo055 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int sumOfSquares = 0;
        while(number!=0){
            int digit = number%10;
            sumOfSquares +=digit*digit;
            number/=10;
        }
        System.out.println("Sum of squares of the digits: "+sumOfSquares);
        sc.close();
    }
}