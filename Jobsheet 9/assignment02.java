import java.util.Scanner;
public class assignment02 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        double totalPrice = 0;

        System.out.print("Enter The numbers of orders : ");
        int totalOrders = isc.nextInt();
        isc.nextLine();

        String[] cstmrOrders = new String[totalOrders];

        double[] ordersPrice = new double[totalOrders];
        
        for (int i = 0; i < cstmrOrders.length; i++) {
            System.out.print("Order number-" +(i+1)+ " (Name of Food or Drink) : ");
            cstmrOrders[i] = isc.nextLine();                
            }

        for (int i = 0; i < ordersPrice.length; i++) {
            System.out.print(cstmrOrders[i]+ " Price (in Rupiah): ");
            ordersPrice[i] = isc.nextDouble();

            totalPrice += ordersPrice[i];
        }

            

            System.out.println("\n======================================================");
            System.out.println("                     ORDERS LIST           ");
            System.out.println("======================================================");
            System.out.printf("| %-4s | %-25s | %-15s |\n", "No.", "Orders Name", "Price");
            System.out.println("------------------------------------------------------");

        for (int i = 0; i < cstmrOrders.length; i++) {
            System.out.printf("| %-4d | %-25s | Rp %,12.2f |\n", 
                              (i + 1), 
                              cstmrOrders[i], 
                              ordersPrice[i]);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("| %-32s | Rp %,12.2f |\n", "TOTAL", totalPrice);
        System.out.println("======================================================");

        System.out.println("\nThank Youfor Your Orders!");

        isc.close();
    }

        
        



        
}
