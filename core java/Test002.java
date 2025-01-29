import java.util.Scanner;
public class test002{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter your reply(yes/no): ");
            String reply = scanner.nextLine();
            
            if (reply=="yes"){
                System.out.println("Happy Sankranthi!");
            } else {
                System.out.println();
                break;
            }
        }
        
        scanner.close();
    }
}