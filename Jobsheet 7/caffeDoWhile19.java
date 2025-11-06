import java.util.Scanner;
public class caffeDoWhile19 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        int coffee, tea, bread;
        String customerName;
        int totalPrice,coffePrice = 12000, teaPrice = 7000, breadPrice = 20000;

        do {
            System.out.print("Enter Customer name (type 'cancel' to exit)   : ");
            customerName = isc.nextLine();
            
            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction Canceled.");
                break;
            }

            System.out.print("Number of Coffees : ");
            coffee = isc.nextInt();
            System.out.print("Number of Teas    : ");
            tea = isc.nextInt();
            System.out.print("Number of Breads  : ");
            bread = isc.nextInt();

            totalPrice = (coffee * coffePrice) + (tea * teaPrice) + (bread * breadPrice);
            System.out.println("Total to be paid  : Rp " + totalPrice);
            isc.nextLine();

        } while (true);
        System.out.println("All Transaction Completed.");
        
        isc.close();
    }
}
