import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // WiFi System
        System.out.println("\n--- Campus WiFi Access System ---");
        System.out.print("Enter user type (Lecturer/Student/Other): ");
        String userType = sc.nextLine().trim().toLowerCase();
        
        switch (userType) {
            case "lecturer":
                System.out.println("✓ WiFi access granted (lecturer)");
                break;
            case "student":
                System.out.print("Enter number of credits taken: ");
                int credits = sc.nextInt();
                
                if (credits >= 12) {
                    System.out.println("✓ WiFi access granted (active student)");
                } else {
                    System.out.println("✗ Access denied, credits less than 12");
                }
                break;
            default:
                System.out.println("✗ Access denied - invalid user type");
        }

    }
    
}
