import java.util.Scanner;
public class experiment6_19 {
    
    static int calculateArea (int l, int w) {
        int area = l * w;
        return area;
    }

    static int calculateVolume (int l, int w, int h) {
        int vol = calculateArea(l, w) * h;
        return vol;
    }
    
    public static void main(String[] args) {
        Scanner isc = new Scanner(System.in);

        int p, l, h, L, vol;

        System.out.print("Input length = ");
        p = isc.nextInt();

        System.out.print("Input width = ");
        l = isc.nextInt();

        System.out.print("Input height = ");
        h = isc.nextInt();

        L = p * l ;
        System.out.println("Area of the Recangle = " + L);

        vol = p * l * h ;
        System.out.println("Area of the Recangle = " + vol);

        isc.close();
    }
}
