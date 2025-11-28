import java.util.Scanner;
public class arrayAverageScore19 {

    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        int totalPassedScr = 0;
        int totalFailedScr = 0;
        int countPassed = 0;
        int countFailed = 0;
        double avgPassed = 0;
        double avgFailed = 0;
        
        System.out.print("Enter the Number of Students : ");
        int numStudents = isc.nextInt();

        int[] finalScores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the Final Score %d : ", i);
            finalScores[i] = isc.nextInt();
        }

        for (int score : finalScores) {
            if (score >= 70) {
                totalPassedScr += score;
                countPassed++;
            } else {
                totalFailedScr += score;
                countFailed++;
            }
        }
        
        if (countPassed > 0) {
            avgPassed = (double) totalPassedScr / countPassed;
        }

        if (countFailed > 0) {
            avgFailed = (double) totalFailedScr / countFailed;
        }

        System.out.println("The average score of students who passed is : " + avgPassed);
        System.out.println("The average score of students who failed is : " + avgFailed);
    
        isc.close();
    }
}