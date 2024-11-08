import java.util.Scanner;
public class BioskopWithScanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int kolom, baris;
        String[][] penonton = new String[4][2];
        penonton [0][0] = "Amin";
        penonton [0][1] = "Bena";
        penonton [1][0] = "Candra"; 
        penonton [1][1] = "Dela";
        penonton [2][0] = "Eka";
        penonton [2][1] = "Farhan";
        penonton [3][0] = "Gisel";
        penonton [3][1] = "Hana";

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            penonton[baris-0][kolom-0] = nama;
            penonton[baris-1][kolom-1] = nama;
            penonton[baris-2][kolom-1] = nama;
            System.out.print("Input penonton lain? (yes/no): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

    }
    
}
