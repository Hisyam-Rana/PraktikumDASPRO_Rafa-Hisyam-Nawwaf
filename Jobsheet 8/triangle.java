import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        System.out.print("Enter The Value of N : ");
        int n = isc.nextInt();

        int i = 0;
        while (i <= n) {
            
            int j = 0;
            while (j < i) {
                System.out.print("*");
            j++;
            }
        System.out.println();
        i++;
        }


        isc.close();
    }
}
