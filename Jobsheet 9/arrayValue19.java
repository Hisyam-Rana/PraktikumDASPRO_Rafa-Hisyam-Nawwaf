import java.util.Scanner;
public class arrayValue19 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        int[] finalScore = new int[10];

        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter The Final Score " +i+ ": ");
            finalScore[i] = isc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Final Score " +i+ " is " + finalScore[i]);
        }
        
    }
}
