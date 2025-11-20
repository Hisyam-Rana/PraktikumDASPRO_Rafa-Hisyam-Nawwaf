import java.util.Scanner;
public class arrayAverageScore19 {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        int[] score = new int[10];
        double total = 0, average;

        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter Student Score " + (i + 1) + ": ");
            score[i] = isc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        
        average = total / score.length;
        System.out.println("The class average score is " + average);
    }
}
