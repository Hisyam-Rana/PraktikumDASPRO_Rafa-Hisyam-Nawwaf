import java.util.Scanner;
public class secondTask {
    public static void main(String[] args) {
        
        Scanner isc = new Scanner(System.in);

        int type, duration, total=0;

        do {

            System.out.print("Vehicle Type (1 Car / 2 Motorcycle / 0 Exit) : ");
            type = isc.nextInt();

            if (type==0) {
                System.out.println("Exit");
                break;
            }

            System.out.print("Parking Duration : ");
            duration = isc.nextInt();

            if (duration >= 5) {
                total = 12500;
                System.out.println("Total to be paid  : Rp " + total);
                isc.nextLine();
            } else if (duration < 5 && type == 1) {
                total = duration * 3000;
                System.out.println("Total to be paid  : Rp " + total);
                isc.nextLine();
            } else {
                total = duration * 2000;
                System.out.println("Total to be paid  : Rp " + total);
                isc.nextLine(); 
            }

        }  while (true); 
        System.out.println("");
    
        isc.close();   
    }
}
