import java.util.Scanner;
public class linearSearch19 {
    public static void main(String[] args) {

        Scanner isc = new Scanner(System.in);

        System.out.print("Enter the Number of Array elements : ");
        int arrayElmnts = isc.nextInt();

        int[] elemntsArray = new int[arrayElmnts];

        for (int i = 0; i < arrayElmnts; i++) {
            System.out.printf("Enter the Array element %d : ", i);
            elemntsArray[i] = isc.nextInt();
        }

        System.out.print("Enter the Key you want to search for : ");
        int key = isc.nextInt();
        int result = 0;

        for (int i = 0; i < elemntsArray.length; i++) {
            if (elemntsArray[i] == key) {
                result = i;
                System.out.println("The Key in the array is located at index position : " + result);
                break;
            } else {
                System.out.println("The Key is not found.");
            }
        
        }
        isc.close();
}    
}
