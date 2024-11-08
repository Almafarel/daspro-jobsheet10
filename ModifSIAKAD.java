import java.util.ArrayList;
import java.util.Scanner;
public class ModifSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] Matkul = new String[3][2];
        Matkul[0][0] = "1. Physic";
        Matkul[0][1] = "2. Matemathic";
        Matkul[1][0] = "3. Languange";
        Matkul[1][1] = "4. Account";
        Matkul[2][0] = "5. Coding";
        Matkul[2][1] = "6. Religion";

        System.out.printf("%s \t %s\n", Matkul[0][0], Matkul[0][1]);
        System.out.printf("%s \t %s\n", Matkul[1][0], Matkul[1][1]);
        System.out.printf("%s \t %s\n", Matkul[2][0], Matkul[2][1]);

        System.out.println("Jumlah Matkul ada: 6");
         String Jumlah = sc.nextLine();
    }
    
}
