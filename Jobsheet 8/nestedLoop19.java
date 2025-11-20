
import java.util.Locale;
import java.util.Scanner;

public class nestedLoop19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        final int cities = 5;
        final int days = 7;
        double[][] temps = new double[cities][days];

        System.out.println("Enter Temperature for " + cities + " city, every city " + days + " value : ");
        for (int i = 0; i < cities; i++) {
            System.out.println("The " + (i+1) + " City : ");
            for (int j = 0; j < days; j++) {
                System.out.print("  Day " + (j+1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nDisplay Array (rows = city, column = day):");
        for (int i = 0; i < cities; i++) {
            for (int j = 0; j < days; j++) {
                System.out.print(temps[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nDisplays (foreach):");
        int row = 1;
        for (double[] cityTemps : temps) {
            System.out.print("City " + row + ": ");
            for (double t : cityTemps) {
                System.out.print(t + " ");
            }
            System.out.println();
            row++;
        }

        System.out.println("\nAverage temperature of each city:");
        for (int i = 0; i < cities; i++) {
            double sum = 0;
            for (int j = 0; j < days; j++) sum += temps[i][j];
            double avg = sum / days;
            System.out.printf("Kota %d: %.2f\n", i+1, avg);
        }
        scanner.close();
    }
}