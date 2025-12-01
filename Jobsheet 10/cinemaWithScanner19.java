import java.util.Scanner;
public class cinemaWithScanner19 {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        int row, column;
        String name, next;

        String[][] audience = new String[4][2];

        while(true) {
            System.out.print("Enter a Name\t\t: ");
            name = isc.nextLine();
            System.out.print("Enter Row number\t: ");
            row = isc.nextInt();
            System.out.print("Enter Column number\t: ");
            column = isc.nextInt();
            isc.nextLine();

            audience[row-1][column-1] = name;
            System.out.print("Are there any other audiences to be added ? (yes/no): ");
            next = isc.nextLine();

            if (next.equalsIgnoreCase("no")) {
                break;
            }
        }

        isc.close();
    }
}
