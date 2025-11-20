
import java.util.Scanner;

public class assignment1 {
    public static void printRightAlignedNumericTriangle(int N) {
        for (int i = 1; i <= N; i++) {

            for (int s = 0; s < N - i; s++) System.out.print(" ");

            for (int k = 1; k <= i; k++) System.out.print(k);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N (0 - 5): ");
        int N = sc.nextInt();

        printRightAlignedNumericTriangle(N);
        System.out.println();
        printRightAlignedNumericTriangle(N);

        sc.close();
    }
}