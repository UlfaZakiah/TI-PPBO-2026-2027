import java.util.Arrays;

public class Latihan5 {
    // Method menghitung total seluruh elemen array
    static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    // Method menyaring elemen yang di atas rata-rata
    static int[] filterDiAtasRataRata(int[] data) {
        if (data.length == 0) return new int[0];

        // 1. Hitung rata-rata
        double rataRata = (double) hitungTotal(data) / data.length;

        // 2. Hitung jumlah elemen yang di atas rata-rata
        int count = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                count++;
            }
        }

        // 3. Buat array baru sesuai ukuran count
        int[] hasil = new int[count];
        int index = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index++] = nilai;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        System.out.println("=== LATIHAN 5 ===");
        int[] data = {70, 85, 60, 90, 75, 95};

        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;
        int[] diAtasRataRata = filterDiAtasRataRata(data);

        System.out.println("Data Ujian         : " + Arrays.toString(data));
        System.out.println("Total Nilai        : " + total);
        System.out.printf("Rata-Rata          : %.2f\n", rataRata);
        System.out.println("Di Atas Rata-Rata  : " + Arrays.toString(diAtasRataRata));
    }
}