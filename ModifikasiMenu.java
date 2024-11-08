import java.util.Scanner;
public class ModifikasiMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int kolom, baris;
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        while (true) {
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (0-3): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (0-1): ");
                    kolom = sc.nextInt();
                    sc.nextLine(); 

                    if (baris >= 0 && baris < 4 && kolom >= 0 && kolom < 2) {
                        penonton[baris][kolom] = nama;
                        System.out.println("Data penonton berhasil diinput.");
                    } else {
                        System.out.println("Posisi tidak valid.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.println("Baris " + i + " Kolom " + j + ": " + penonton[i][j]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
  
    
}
}
}
