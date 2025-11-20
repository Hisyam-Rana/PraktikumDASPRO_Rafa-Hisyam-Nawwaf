
import java.util.Scanner;

public class assignment3 {
    public static void printBorderSquare(int n, int d) {
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r == 1 || r == n || c == 1 || c == n) {
                    System.out.print(d + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value N1: ");
        int N1 = sc.nextInt();
        System.out.print("Enter number for Square N1 (Example : 3): ");
        int d1 = sc.nextInt();

        System.out.print("Enter the value N2: ");
        int N2 = sc.nextInt();
        System.out.print("Enter number for Square N2 (Example : 5): ");
        int d2 = sc.nextInt();

        System.out.println("\nSquare 1:");
        printBorderSquare(N1, d1);
        System.out.println("\nSquare 2:");
        printBorderSquare(N2, d2);

        sc.close();
    }
}