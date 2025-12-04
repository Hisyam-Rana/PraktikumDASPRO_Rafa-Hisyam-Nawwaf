import java.util.Scanner;
public class expressingGratitude_19 {
    public static String getGreetingRecipient() {
        Scanner isc = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : " );
        String recipientName = isc.nextLine();
        isc.close();
        return recipientName;
    }

     public static void sayThankYou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " +name+ " for being the best teacher in the world.\n" +
            "You inspired in me a love for learning and made me feel like i could ask you anything");
    }

    public static void main(String[] args) {
        sayThankYou();
    }

}
