import java.util.Scanner;
public class Assignment03 {
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        String order;
        int foundedOrder = -1;

        String[] menu = {"Fried Rice", "Fried Noodles", 
                        "Toasted Bread", "Fried Potatoes", 
                        "Teh Tarik", "Cappuccino", 
                        "Chocolate Ice"};

        System.out.println("===List of Cafe===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.println("---------------------------------------");

        System.out.print("Enter Your Order : ");
        order = isc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(order)) {
                foundedOrder = i;
                break;
            }
        }
        
        System.out.println("\n---------------------------------------");
        System.out.println("           ORDER RESULT          ");
        System.out.println("---------------------------------------");

        if (foundedOrder != -1) {
            
            System.out.println("The " + order + " is available");
            System.out.println("Your order is available in our menu.");
        } else {
            System.out.println("The " + order + " is not available.");
            System.out.println("we were really Sorry that the order \nyou want is not available in our menu.");
        }
        System.out.println("---------------------------------------");

    }
}

