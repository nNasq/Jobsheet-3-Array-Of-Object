import java.util.Scanner;

public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah matakuliah: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Matakuliah10[] arrayOfMatakuliah = new Matakuliah10[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah10();
            arrayOfMatakuliah[i].tambahData();
            System.out.println("----------------------------------------");
        }

        System.out.println("\n=== DATA MATAKULIAH ===");
        for (int i = 0; i < jumlah; i++) {
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("----------------------------------------");
        }
    }
}