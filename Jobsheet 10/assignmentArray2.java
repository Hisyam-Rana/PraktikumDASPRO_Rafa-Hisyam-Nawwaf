import java.util.Scanner;

public class assignmentArray2 {

    public static void main(String[] args) {

        Scanner isc = new Scanner(System.in);

        int respondents = 10;
        int questions = 6;

        int[][] dataSurvey = new int[respondents][questions];
        
        System.out.println("=== SURVEY DATA INPUT (Skor 1-5) ===");
        System.out.println("Input Scores for " + respondents + " respondents and " + questions + " questions.");

        
        for (int i = 0; i < respondents; i++) {
            System.out.println("\n--- Respondents-" + (i + 1) + " ---");
            for (int j = 0; j < questions; j++) {
                
                int score;
                do {
                    System.out.print("Input Question Skor number " + (j + 1) + " (1-5): ");
                    score = isc.nextInt();

                    if (score >= 1 && score <= 5) {
                        dataSurvey[i][j] = score;
                        break;
                    } else {
                        System.out.println("The score must be between 1 and 5. Please try again.");
                    }
                    
                } while (true);
            }
        }
        
        System.out.println("\n-------------------------------------------------");
        System.out.println("Survey Data Successfully Entered. Starting Analysis...");
        System.out.println("-------------------------------------------------");

        System.out.println("=== Average Satisfaction Score for Each Respondent ===");

        
        for (int i = 0; i < respondents; i++) {
            int totalScorePerRespondent = 0;

            for (int j = 0; j < questions; j++) {
                totalScorePerRespondent = totalScorePerRespondent + dataSurvey[i][j];
            }

            double averagePerRespondent = (double) totalScorePerRespondent / questions;

            System.out.printf(" - RESPONDENT-%2d: - \nTotal Score\t= %d \nAverage\t\t= %.2f\n\n",
                              (i + 1), totalScorePerRespondent, averagePerRespondent);
        }
        System.out.println("-------------------------------------------------");

        System.out.println("=== Average Satisfaction Score for Each Question ===");

        for (int j = 0; j < questions; j++) {
            int totalScorePerQuestion = 0;

            for (int i = 0; i < respondents; i++) {
                totalScorePerQuestion = totalScorePerQuestion + dataSurvey[i][j];
            }

            double averagePerQuestion = (double) totalScorePerQuestion / respondents;

            System.out.printf("- Questions-%2d: - \nTotal Score\t= %d \nRata-Rata\t= %.2f\n\n",
                              (j + 1), totalScorePerQuestion, averagePerQuestion);
        }
        System.out.println("-------------------------------------------------");

        System.out.println("=== Average Overall Satisfaction Score ===");

        int grandTotalScore = 0;
        int totalDataPoints = respondents * questions;

        for (int i = 0; i < respondents; i++) {
            for (int j = 0; j < questions; j++) {
                grandTotalScore = grandTotalScore + dataSurvey[i][j];
            }
        }

        double overallAverage = (double) grandTotalScore / totalDataPoints;

        System.out.printf("Overall Score\t\t: %d\n", grandTotalScore);
        System.out.printf("Total Data Points\t: %d\n", totalDataPoints);
        System.out.printf("Overall Average Score\t: %.2f\n", overallAverage);
        System.out.println("-------------------------------------------------");
    
        isc.close();
    }
}