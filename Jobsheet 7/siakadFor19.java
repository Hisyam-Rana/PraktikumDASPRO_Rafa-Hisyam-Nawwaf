import java.util.Scanner;
public class siakadFor19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double grade, highest=0, lowest=100;
        int tSPassed = 0, tSFailed = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter The Grade of The " + i + " Student : ");
            grade = sc.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            if (grade > 60) {
                tSPassed++;
            } else {
                tSFailed++;
            }

        
        
        }

        System.out.println("The Highest Grade : " + highest);
        System.out.println("The Lowest Grade : " + lowest);
        System.out.println("PASSED : " + tSPassed);
        System.out.println("FAILED : " + tSFailed);

        sc.close();
    }
}
