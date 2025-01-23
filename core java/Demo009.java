import java.util.Scanner;

public class Demo009 {
    String Cust_Name = "Prasunamba";
    long Account_no = 123456;
    Double Balance = 10000.00;

    void accept_details() {
        System.out.println("Enter your name and account number:");

        Scanner sc = new Scanner(System.in);
        
        Cust_Name = sc.nextLine();

        String accountNumberString = sc.nextLine();
        Account_no = Long.parseLong(accountNumberString);
    }

    void Display_details() {
        System.out.println("Hello " + Cust_Name);
        System.out.println("Your balance is " + Balance);
    }

    public static void main(String[] args) {
        Demo009 obj = new Demo009();
        obj.accept_details();
        obj.Display_details();
    }
}
