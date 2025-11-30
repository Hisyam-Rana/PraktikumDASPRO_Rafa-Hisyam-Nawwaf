import java.util.Scanner;
public class assignment01 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        int highest = 0, lowest = 100, total = 0;
        double average;

        System.out.print("Enter The numbers of student : ");
        int numStudents = isc.nextInt();

        int[] gradeStudent = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Enter the Students %d grade : ", (i+1));
            gradeStudent[i] = isc.nextInt();
            if (gradeStudent[i] > highest) {
                highest = gradeStudent[i];
            }
            if (gradeStudent[i] < lowest) {
                lowest = gradeStudent[i];
            }
        }

        for (int j = 0; j < gradeStudent.length; j++) {
            total += gradeStudent[j];
        } 

        average = total / gradeStudent.length;
        
        for (int k = 0; k < gradeStudent.length; k++) {
            System.out.println("The grade of student " +(k+1)+ " : " +gradeStudent[k]);
        }
        
        System.out.println("The Highest score of all Students : " + highest);
        System.out.println("The Lowest score of all Students : " + lowest);
        System.out.println("The Average score of all Students : " + average);
        
        isc.close();
    }
}
