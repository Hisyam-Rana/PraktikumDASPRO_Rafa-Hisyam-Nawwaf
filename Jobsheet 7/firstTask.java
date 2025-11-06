import java.util.Scanner;
public class firstTask {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        int ticketsSold, totalTicketSales;
        double ticket, ticketPrice = 50000, totalPrice;
        String customerName;
        
        do { 
            System.out.print("Enter Customer Name (type 'cancel' to exit) : ");
            customerName = isc.nextLine();

            if (customerName.equalsIgnoreCase("cancel")) {
                System.out.println("Transaction Canceled.");
                break;
            }
            
            System.out.print("Number of Tickets : ");
            ticket = isc.nextInt();

            if (ticket < 0) {
                System.out.println("Invalid input, Re-enter a valid input!");
                continue;
            }

            if (ticket > 4) {
                totalPrice = (ticket * ticketPrice) * 0.1;
                System.out.println("Total to be paid  : Rp " + totalPrice);
                isc.nextLine();
            } else if (ticket > 10) {
                totalPrice = (ticket * ticketPrice) * 1.5;
                System.out.println("Total to be paid  : Rp " + totalPrice);
                isc.nextLine();
                totalPrice = (ticket * ticketPrice);
                System.out.println("Total to be paid  : Rp " + totalPrice);
                isc.nextLine();
            } else {
                totalPrice = ticket * ticketPrice;
                System.out.println("Total to be paid  : Rp " + totalPrice);
                isc.nextLine();
            }

            

        } while (true);
        System.out.println("The Purchase has been Completed.");
        
        isc.close();
        } 

        
    }
