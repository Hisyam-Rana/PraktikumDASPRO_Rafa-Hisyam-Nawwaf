import java.util.Scanner;

public class PowerRecursive19 {
    
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        System.out.print("Input Base Number : ");
        int base = isc.nextInt();
        System.out.print("Input Power Number : ");
        int power = isc.nextInt();

        System.out.println("\nResult of " +base+ " power " +power+ " = " +
                                            calculatePower(base, power));
        for (int i = 1; i <= power; i++) {
                System.out.print(base + "x" );
            }
        System.out.print("1");
        System.out.print(" = " + calculatePower(base, power));
        isc.close();
    }

    static int calculatePower (int base, int pow) {
        int total;
        
        if (pow == 1) {
            return base;
        }

        total = base * calculatePower(base, pow-1);
        return total;
    }
}
