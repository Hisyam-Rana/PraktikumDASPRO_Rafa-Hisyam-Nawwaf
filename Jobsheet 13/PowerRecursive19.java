import java.util.Scanner;

public class PowerRecursive19 {
    
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        System.out.print("Input Base Number : ");
        int base = isc.nextInt();
        System.out.print("Input Power Number : ");
        int power = isc.nextInt();

        System.out.println("Result of " +base+ " power " +power+ " = " +
                                            calculatePower(base, power));

        isc.close();
    }

    static int calculatePower (int base, int pow) {
        if (pow == 1) {
            return 1;
        } else {
            return base * calculatePower(base, pow-1);
        }
    }


}
