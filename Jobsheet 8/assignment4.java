
import java.util.*;

public class assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] sports = {"Badminton", "TableTennis", "Basketball", "Volleyball"};
        Map<String, List<String>> participants = new LinkedHashMap<>();

        for (String sport : sports) {
            System.out.println("Masukkan 5 nama atlet untuk " + sport + ":");
            List<String> names = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                System.out.print("  Nama " + (i+1) + ": ");
                names.add(sc.nextLine().trim());
            }
            participants.put(sport, names);
        }

        System.out.println("\nDaftar atlet (urut ascending per cabang):");
        for (Map.Entry<String, List<String>> e : participants.entrySet()) {
            String sport = e.getKey();
            List<String> names = e.getValue();
            Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
            System.out.println("== " + sport + " ==");
            for (String n : names) System.out.println("  " + n);
        }
        sc.close();
    }
}