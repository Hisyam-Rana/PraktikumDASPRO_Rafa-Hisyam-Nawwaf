import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        int n, i, iOuter;

        System.out.print("Enter The Value of N : ");
        n = isc.nextInt();

        for (iOuter = 1; iOuter <= n; iOuter++) {
            for (i = 1; i <= n; i++) {
            System.out.print("*");
            }
            System.out.println("");
        }

        isc.close();
    }
}
