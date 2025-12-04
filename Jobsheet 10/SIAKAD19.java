import java.util.Scanner;
public class SIAKAD19 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        System.out.print("Enter the number of Sudents : ");
        int students = isc.nextInt();

        System.out.print("Enter the number of Courses : ");
        int courses = isc.nextInt();

        int[][] score = new int[students][courses];

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter scores for student #" + (i+1));
            double sumForEachStudent = 0;

            for (int j = 0; j < score[i].length; j++) {
                System.out.print("Course #" + (j+1) + " score : ");
                score[i][j] = isc.nextInt();
                sumForEachStudent += score[i][j];
            }

            System.out.println("Average score : " + sumForEachStudent / 3);
        }

        for (int j = 0; j < 3; j++) {
            double sumForEachCourse = 0;

            for (int i = 0; i < 4; i++) {
                sumForEachCourse += score[i][j];
            }

            System.out.println("Course " + (j+1) + " : " + (sumForEachCourse / 4));
        }
        isc.close();
    }
}
