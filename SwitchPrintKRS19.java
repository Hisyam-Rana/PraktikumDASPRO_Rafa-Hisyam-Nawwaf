import java.util.Scanner;
public class SwitchPrintKRS19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS Siakad---");
        System.out.print("Enter Current Semester : ");
        int semester = sc.nextInt();

        //          Switch Version
        //switch (semester) {
            //case 1:
            //System.out.println("KRS Semester 1 is displayed");
            //break;
            //case 2:
            //System.out.println("KRS Semester 2 is displayed");
            //break;
            //case 3:
            //System.out.println("KRS Semester 3 is displayed");
            //break;
            //case 4:
            //System.out.println("KRS Semester 4 is displayed");
            //break;
            //case 5:
            //System.out.println("KRS Semester 5 is displayed");
            //break;
            //case 6:
            //System.out.println("KRS Semester 6 is displayed");
            //break;
            //case 7:
            //System.out.println("KRS Semester 7 is displayed");
            //break;
            //case 8:
            //System.out.println("KRS Semester 8 is displayed");
            //break;
            //default:
            //System.out.println("Invalid Semester");

            if (semester == 1) {
                System.out.println("Semester 1 KRS displayed");
            } else if (semester == 2) {
                System.out.println("Semester 2 KRS displayed");
            } else if (semester == 3) {
                System.out.println("Semester 3 KRS displayed");
            } else if (semester == 4) {
                System.out.println("Semester 4 KRS displayed"); 
            } else if (semester == 5) {
                System.out.println("Semester 5 KRS displayed");
            } else if (semester == 6) {
                System.out.println("Semester 6 KRS displayed");
            } else if (semester == 7) {
                System.out.println("Semester 7 KRS displayed");
            } else if (semester == 8) {
                System.out.println("Semester 8 KRS displayed"); 
            } else {
                System.out.println("Invalid Semester");
            }
    }
    
}