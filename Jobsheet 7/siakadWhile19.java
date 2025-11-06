import java.util.Scanner;
public class siakadWhile19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i=0, grade, total;

        System.out.print("Enter The Number of Student : ");
        total = input.nextInt();

        while (i < total) {
            
            System.out.print("Enter the Grade of the " + (i + 1) + " Student : ");
            grade = input.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid Grade, Re-enter a valid Grade!");
                continue;
            }

            if (grade > 80 && grade <= 100) {
                System.out.println("The Grade of the " + (i + 1) + " Student is A. Good, keep the Grade!");
            } else if (grade > 73 && grade <= 80) {
                System.out.println("The Grade of the " + (i + 1) + " Student is B+");
            } else if (grade > 65 && grade <= 73) {
                System.out.println("The Grade of the " + (i + 1) + " Student is B");
            } else if (grade > 60 && grade <= 65) {
                System.out.println("The Grade of the " + (i + 1) + " Student is C+");
            } else if (grade > 50 && grade <= 60) {
                System.out.println("The Grade of the " + (i + 1) + " Student is C");
            } else if (grade > 39 && grade <= 50) {
                System.out.println("The Grade of the " + (i + 1) + " Student is D");
            } else {
                System.out.println("The Grade of Student " + (i + 1) + " is E");
            }
            
            i++;
        }
        
        input.close();
    }
}
