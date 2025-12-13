import java.util.Scanner;

public class ProfitRecursive19 {
    
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);
        
        double base = 0;

        System.out.print("Input Balance : ");
        double initialBalance = isc.nextInt();
        System.out.print("Input Investment Period : ");
        int investPeriod = isc.nextInt();

        System.out.println("Balance after " +investPeriod+ " year = " + 
                    calculateProfit(initialBalance, investPeriod));

        isc.close();
    }
    
    static double calculateProfit (double balance, int period) {
        if (period == 0) {
            return balance;
        } else {
            return 1.11 * calculateProfit(balance, period - 1);
        }
    }
}
