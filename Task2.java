import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the Number : ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }
    
}
