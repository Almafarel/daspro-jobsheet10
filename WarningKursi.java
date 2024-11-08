import java.util.Scanner;
public class WarningKursi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        int kolom, baris;
        String[][] penonton = new String[4][2];

        // Inisialisasi data awal penonton
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

                    while (true) {
                        System.out.print("Masukkan baris (0-3): ");
                        baris = sc.nextInt();
                        
                        if (baris < 0 || baris >= 4) {
                            System.out.println("Baris tidak tersedia. Silakan masukkan nomor baris antara 0 dan 3.");
                            continue; 
                        }

                        System.out.print("Masukkan kolom (0-1): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (kolom < 0 || kolom >= 2) {
                            System.out.println("Kolom tidak tersedia. Silakan masukkan nomor kolom antara 0 dan 1.");
                            continue;
                        }

                        if (penonton[baris][kolom] != null) {
                            System.out.println("Kursi di baris " + baris + " kolom " + kolom + " sudah terisi oleh " + penonton[baris][kolom] + ".");
                            System.out.println("Silakan pilih kursi lain.");
                        } else {
                            penonton[baris][kolom] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                            break; 
                        }
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isiKursi = penonton[i][j] == null ? "Kosong" : penonton[i][j];
                            System.out.println("Baris " + i + " Kolom " + j + ": " + isiKursi);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program.");

                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}
    

