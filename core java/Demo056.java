import java.util.Scanner;
public class Demo056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sumOfCubes=0;
        while(n!=0){
            int digit = n%10;
            sumOfCubes +=digit *digit*digit;
            n/=10;
        }
        System.out.println("Sum of cubes of the digits: "+sumOfCubes);
        sc.close();
    }
}