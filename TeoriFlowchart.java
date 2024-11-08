import java.util.Scanner;
public class TeoriFlowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] hasilSurvey = new int[10][6];  

        System.out.println("Masukkan hasil kepuasan pelanggan (nilai 1-5):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai untuk Pertanyaan " + (j + 1) + ": ");
                hasilSurvey[i][j] = sc.nextInt();
             
                while (hasilSurvey[i][j] < 1 || hasilSurvey[i][j] > 5) {
                    System.out.print("Nilai tidak valid. Masukkan nilai 1-5: ");
                    hasilSurvey[i][j] = sc.nextInt();
                }
            }
            System.out.println();
        }

        System.out.println("Nilai Rata-rata untuk Setiap Responden:");
        for (int i = 0; i < 10; i++) {
            double totalResponden = 0;
            for (int j = 0; j < 6; j++) {
                totalResponden += hasilSurvey[i][j];
            }
            double rataRataResponden = totalResponden / 6;
            System.out.println("Responden " + (i + 1) + ": " + rataRataResponden);
        }

        System.out.println("Nilai Rata-rata untuk Setiap Pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double totalPertanyaan = 0;
            for (int i = 0; i < 10; i++) {
                totalPertanyaan += hasilSurvey[i][j];
            }
            double rataRataPertanyaan = totalPertanyaan / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rataRataPertanyaan);
        }

        double totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += hasilSurvey[i][j];
            }
        }
        double rataRataKeseluruhan = totalKeseluruhan / (10 * 6);
        System.out.println("Nilai Rata-rata Keseluruhan: " + rataRataKeseluruhan);

    }
    
}
