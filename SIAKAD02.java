import java.util.Scanner;
public class SIAKAD02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPerMatkul, totalPerSiswa = 0;
        int[][] nilai = new int[4][3];
        nilai [0][0] = 89;
        nilai [0][1] = 82;
        nilai [0][2] = 77;
        nilai [1][0] = 91;
        nilai [1][1] = 69;
        nilai [1][2] = 79;
        nilai [2][0] = 70;
        nilai [2][1] = 88;
        nilai [2][2] = 90;
        nilai [3][0] = 81;
        nilai [3][1] = 86;
        nilai [3][2] = 95;

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai Mahasiswa ke-" + (i + 1));
            totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; i++) {
                System.out.print("Nilai mata kuliah " + (j+1) + ": ");;
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
           
        }
        

        for (int j =0; j < 4; j++) {
             totalPerMatkul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / 4);
        }
        System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        System.out.println("\n=============================");
        System.out.println("Rata-rata nilai setiap kuliah");

       
    }
    
}
