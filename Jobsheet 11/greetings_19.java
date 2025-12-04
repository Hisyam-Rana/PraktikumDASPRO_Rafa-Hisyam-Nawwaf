import java.util.Scanner;
public class greetings_19 {
    
    public static String getGreetingRecipient() {
        Scanner isc = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : " );
        String recipientName = isc.nextLine();
        isc.close();
        return recipientName;
    }

    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thank You " +name+ ". May the force be with you!");
    }
}
