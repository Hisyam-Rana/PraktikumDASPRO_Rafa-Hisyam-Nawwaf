import java.util.Scanner;
public class IfPrintKRS19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Print KRS Siakad---");
        System.out.print("Have the Tuition fees been paid in full ? (True/False) : ");
        boolean uktLunas = sc.nextBoolean();

        // IF-ELSE Version
        if (uktLunas) {
            System.out.println("UKT Payment has been Verified");
            System.out.println("KRS now can be printed and you can ask the Academic Advisor to sign it.");   
        } else {
            System.out.println("UKT Payment has not been verified");
            System.out.println("KRS can't be printed");
        }
        
         // Ternary Operator Version
        String message = uktLunas 
                ? "UKT Payment has been verified\nKRS now can be printed and you can ask the academic advisor to sign it"
                : "UKT Payment has not been verified";
        System.out.println(message);
    }
}