import java.util.Scanner;
public class cinemaWithScanner19 {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        int choice;

        String[][] audience = new String[4][2];

        do {
            System.out.println("\n===== Cinema Audience Management =====");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            if (isc.hasNextInt()) {
                choice = isc.nextInt();
                isc.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                isc.nextLine();
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1 :
                    while (true) {
                        System.out.print("Enter a Name\t\t: ");
                        String name = isc.nextLine();
                        System.out.print("Enter Row number\t: ");
                        int row = isc.nextInt();
                        System.out.print("Enter Column number\t: ");
                        int column = isc.nextInt();
                        isc.nextLine();
                    
                        audience[row-1][column-1] = name;
                        System.out.print("Are there any other audiences to be added ? (Yes / No): ");
                        String next = isc.nextLine();

                        if (next.equalsIgnoreCase("no")) {
                            break;
                        } 
                    }
                    
                    break;
                
                case 2 :
                    System.out.println("\n--- Audience List (Row-by-Row) ---");
                    System.out.print("Columns: \t");
        
        
                    for (int c = 0; c < audience[0].length; c++) {
                        System.out.printf("Col %d\t\t", c + 1);
                        }
                    System.out.println();
                    System.out.println("--------------------------------------------------");

        
                    for (int r = 0; r < audience.length; r++) {
                        System.out.printf("Row %d:\t\t", r + 1);
                        for (int c = 0; c < audience[r].length; c++) {
                        String seatContent = audience[r][c] == null ? "***" : audience[r][c];
                        System.out.printf("%s\t\t", seatContent);
                    }
                    System.out.println();
                    }
                    System.out.println("--------------------------------------------------");
                    System.out.println("*** indicates an empty seat.");

                    break;
                case 3 :
                    System.out.println("Thank you for using the Cinema Audience Management system. Goodbye!");                    
                    
                    break;

                default :
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }
        } while (choice != 3);

        isc.close();
    }
}
