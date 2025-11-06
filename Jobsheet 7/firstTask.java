import java.util.Scanner;
public class firstTask {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);
        
        int totalTicketsSold=0, totalTicketSales=0, sold=0, totalRevenue=0, ticketStatus;
        double ticket=0, ticketPrice = 50000, totalPrice=0;
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
                totalPrice = (ticket * ticketPrice) * 0.10;
                System.out.println("Total to be paid  : Rp " + totalPrice);
                isc.nextLine();
            } else if (ticket > 10) {
                totalPrice = (ticket * ticketPrice) * 0.15;
                System.out.println("Total to be paid  : Rp " + totalPrice);
                isc.nextLine();
            } else {
                totalPrice = ticket * ticketPrice;
                System.out.println("Total to be paid  : Rp " + totalPrice);
                isc.nextLine();
            }

           

           

            

        } while (true);
        totalTicketsSold += ticket;
        totalTicketSales += totalPrice;
        
        System.out.println("All Purchase has been Completed.");
        System.out.println("Total of Ticket Sold : " + totalTicketsSold);
        System.out.println("Total of Ticket Sales : " + totalPrice);
        
        isc.close();
        } 

        
    }
