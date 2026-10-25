import java.util.Scanner;

public class Latihan4 {
    // Method mencari nilai minimum
    static int cariNilaiMinimum(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    // Method mencari nilai maksimum
    static int cariNilaiMaksimum(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== LATIHAN 4 ===");
        System.out.print("Masukkan jumlah data ujian: ");
        int n = scanner.nextInt();

        int[] dataUjian = new int[n];
        System.out.println("Masukkan " + n + " nilai ujian:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            dataUjian[i] = scanner.nextInt();
        }
        System.out.println("\n--- Hasil ---");
        System.out.println("Nilai Minimum  : " + cariNilaiMinimum(dataUjian));
        System.out.println("Nilai Maksimum : " + cariNilaiMaksimum(dataUjian));
        scanner.close();
    }
}