import java.util.Scanner;

public class weeklyGradesManagement {

static Scanner isc = new Scanner(System.in);
static int students = 5;
static int weeks = 7 ; 
static int[][] grades = new int[students][weeks]; 
static String[] studentNames = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void main(String[] args) {
        
        int choice;

        do {
            System.out.println("\n===========================================");
            System.out.println("     WEEKLY GRADE MANAGEMENT SYSTEM       ");
            System.out.println("===========================================");
            System.out.println("1. Input/Update Student Grade");
            System.out.println("2. Display All Grade");
            System.out.println("3. Search Week by the Highest Grade");
            System.out.println("4. Search Student by the Highest Grade");
            System.out.println("0. Exit");
            System.out.print("Your Choice : ");
            choice = isc.nextInt();

            if (choice < 0 || choice > 4) {
                System.out.println("Invalid Choice. Enter Number from 0-4.");
                continue;
            }

            switch (choice) {
                case 1:
                    inputStudentsGradeData();
                    break;
                
                case 2:
                    displayAllStudentGrades();
                    break;
                
                case 3:
                    findHighestGradeWeek();
                    break;
                
                case 4:
                    findHighestGradeStudent();
                    break;
                
                case 0:
                    System.out.println("Thankk you. Exitting the Program");
                    break;
                
                default:
                    System.out.println("Invalid Choice. Enter number from 0-4.");
                    break;
            }
        } while (choice != 0);
    }    

    public static void inputStudentsGradeData () {
        
        System.out.println("\n=== STUDENT GRADE INPUT ===");
        System.out.println("List of Students");

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println((i+1) + ". " + studentNames[i]);
        }

        int studentChosen;
        boolean inputValid = false;

        do {
            System.out.print("Choose Students number (1-" + studentNames.length + ") : ");
            studentChosen = isc.nextInt();
            int studentIndex = studentChosen - 1;

            if (studentIndex >= 0 && studentIndex < studentNames.length) {
                inputValid = true; 
                
                System.out.println("\nInputting grades for\t: " + studentNames[studentIndex]);
                for (int i = 0; i < weeks; i++) {
                    System.out.print("Input Grades for week-" + (i + 1) + " : ");
                    grades[studentIndex][i] = isc.nextInt();
                }
                
                    System.out.println("\nThe Grades for " + studentNames[studentIndex] + " has been added.");
                
            } else {
                System.out.println("\nInvalid Choice. Please enter a number between 1 and " + studentNames.length + ".");
                }
                
            } while (!inputValid);
        }

    

    public static void displayAllStudentGrades() {
        System.out.println("\n=== All Students Grade (Week 1 - 7) ===");

        System.out.printf("%-10s", "NAME");
        
        for (int i = 0; i < grades[0].length; i++) {
            System.out.printf("|%-8s", "Week " + (i + 1));
        }

        System.out.println();
        System.out.println("=======================================================================");

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("%-10s", studentNames[i]);
            
            for (int j = 0; j < grades[i].length; j++) { 
                System.out.printf("|%-8d", grades[i][j]);
            }

            System.out.println();
        }
    }

    public static void findHighestGradeWeek() {
        System.out.println("\n=== Week with the Highest Grade ===");
        
        int highestGrade = 0;
        int bestWeekIndex = 0;
        
        for (int j = 0; j < grades[0].length; j++) { 
            int currentWeekTotal = 0;
            for (int i = 0; i < grades.length; i++) {
                currentWeekTotal += grades[i][j];
            }
            
            if (currentWeekTotal > highestGrade) {
                highestGrade = currentWeekTotal;
                bestWeekIndex = j;
            }
        }
        
        if (bestWeekIndex != 0) {
            System.out.println("The highest total grade of all students occurred in :");
            System.out.println("in Week\t\t:  " + (bestWeekIndex + 1));
            System.out.println("with Total Grade : " + highestGrade);
        } else {
            System.out.println("There is no data of Students Grade.");
        }
    }

    public static void findHighestGradeStudent() {
        System.out.println("\n=== Student with the Highest Overall Score ===");
        
        int overallHighestGrade = 0;
        int bestStudent = 0;
        
        for (int i = 0; i < grades.length; i++) {
            int studentTotal = 0;
            for (int j = 0; j < grades[i].length; j++) {
                studentTotal += grades[i][j];
            }
            
            if (studentTotal > overallHighestGrade) {
                overallHighestGrade = studentTotal;
                bestStudent = i;
            }
        }
        
        if ( bestStudent != 0) {
            String bestStudentName = studentNames[bestStudent];
            System.out.println("Student with the highest grade is : " + bestStudentName);
            System.out.println("Total Overall Grade: " + overallHighestGrade);
            
            System.out.println("\nGrade Detail " + bestStudentName + ":");
            for (int j = 0; j < grades[bestStudent].length; j++) {
                System.out.println("  Week " + (j + 1) + ": " + grades[bestStudent][j]);
            }
            
        } else {
            System.out.println("There is no data of Students Grade.");
        }
    }
}
