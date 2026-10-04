import java.util.Scanner;

public class PengolahNilaiKelas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double KKM = 70.0; // Poin (b)

       // TAHAP A: MENGAMBIL INPUT JUMLAH MAHASISWA & NILAI UJIAN
        System.out.println("==================================================");
        System.out.println("            INPUT DATA NILAI UJIAN               ");
        System.out.println("==================================================");

        // Read jumlah mahasiswa N menggunakan Scanner
        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int n = scanner.nextInt();

        // Inisialisasi array ukuran N
        double[] nilai = new double[n];

        // Loop untuk mengisi array dengan nilai mahasiswa
        System.out.println("\n--- Masukkan Nilai Setiap Mahasiswa ---");
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = scanner.nextDouble();
        }

        // Menyimpan salinan array asli sebelum diurutkan (Poin c)
        double[] nilaiSebelum = new double[n];
        for (int i = 0; i < n; i++) {
            nilaiSebelum[i] = nilai[i];
        }

        // TAHAP B: MENGHITUNG STATISTIK KELAS
        double totalNilai = 0;
        double nilaiTertinggi = (n > 0) ? nilai[0] : 0;
        double nilaiTerendah = (n > 0) ? nilai[0] : 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < n; i++) {
            // Hitung total untuk mencari rata-rata
            totalNilai += nilai[i];

            // Cari nilai tertinggi
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }

            // Cari nilai terendah
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            // Cek status kelulusan berdasarkan KKM (>= 70)
            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        // Hitung rata-rata kelas
        double rataRata = (n > 0) ? (totalNilai / n) : 0;

        // TAHAP C: MEMPERBAIKI & MENGURUTKAN ARRAY (ASCENDING - BUBBLE SORT) Tanpa menggunakan method sorting bawaan Java (Arrays.sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    // Proses tukar posisi (swap)
                    double temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // TAHAP D: MENAMPILKAN LAPORAN HASIL SECARA RAPI
        System.out.println("\n==================================================");
        System.out.println("            LAPORAN PENGOLAHAN NILAI             ");
        System.out.println("==================================================");
        System.out.printf("Nilai KKM Kelulusan         : %.2f\n", KKM);
        System.out.println("Total Mahasiswa             : " + n + " orang");
        System.out.println("--------------------------------------------------");

        // Menampilkan array nilai sebelum diurutkan
        System.out.print("Nilai Sebelum Diurutkan     : [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilaiSebelum[i] + (i == n - 1 ? "" : ", "));
        }
        System.out.println(" ]");

        // Menampilkan array nilai setelah diurutkan
        System.out.print("Nilai Sesudah Diurutkan     : [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + (i == n - 1 ? "" : ", "));
        }
        System.out.println(" ]");

        System.out.println("--------------------------------------------------");
        System.out.printf("Rata-rata Nilai Kelas       : %.2f\n", rataRata);
        System.out.printf("Nilai Tertinggi             : %.2f\n", nilaiTertinggi);
        System.out.printf("Nilai Terendah              : %.2f\n", nilaiTerendah);
        System.out.println("Jumlah Mahasiswa Lulus      : " + jumlahLulus + " orang");
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus + " orang");
        System.out.println("==================================================");

        scanner.close();
    }
}
