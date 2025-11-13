import java.util.Scanner;
public class star {
    public static void main(String[] args) {

        Scanner isc = new Scanner(System.in);

        int n, i;

        System.out.print("Enter The Value of N : ");
        n = isc.nextInt();

        for (i = 1; i <= n; i--) {
            System.out.print("*");
        }



        isc.close();
    }
}