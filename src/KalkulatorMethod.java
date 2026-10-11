import java.util.Scanner;

public class KalkulatorMethod {
    //Method static operasi matematika + overloading tambah
    static double tambah(double a, double b) { return a + b; }
    static double tambah(double a, double b, double c) { return a + b + c; }
    static double kurang(double a, double b) { return a - b; }
    static double kali(double a, double b) { return a * b; }
    static double bagi(double a, double b) { return a / b; }
    static double pangkat(double a, double b) { return Math.pow(a, b); }
    static double akarKuadrat(double a) { return Math.sqrt(a); }

    //Method mencari nilai hasil maksimum dari riwayat
    static double riwayatKeMaksimum(double[] riwayatHasil, int jumlah) {
        double max = riwayatHasil[0];
        for (int i = 1; i < jumlah; i++) {
            if (riwayatHasil[i] > max) {
                max = riwayatHasil[i]; }
        }
        return max;
    }

    //Main method, loop menu, dan scanner
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array untuk menyimpan riwayat hasil
        double[] riwayat = new double[100]; int totalRiwayat = 0, pilih = 0;

        while (pilih != 8) {
            System.out.println("\n--- MENU KALKULATOR ---");
            System.out.println("1. Tambah (2 angka)");
            System.out.println("2. Tambah (3 angka)");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu (1-8): ");
            pilih = in.nextInt();

            double hasil = 0; boolean simpanHasil = true;

            switch (pilih) {
                case 1:
                    System.out.print("Angka 1: "); double a1 = in.nextDouble();
                    System.out.print("Angka 2: "); double b1 = in.nextDouble();
                    hasil = tambah(a1, b1);
                    break;
                case 2:
                    System.out.print("Angka 1: "); double a2 = in.nextDouble();
                    System.out.print("Angka 2: "); double b2 = in.nextDouble();
                    System.out.print("Angka 3: "); double c2 = in.nextDouble();
                    hasil = tambah(a2, b2, c2);
                    break;
                case 3:
                    System.out.print("Angka 1: "); double a3 = in.nextDouble();
                    System.out.print("Angka 2: "); double b3 = in.nextDouble();
                    hasil = kurang(a3, b3);
                    break;
                case 4:
                    System.out.print("Angka 1: "); double a4 = in.nextDouble();
                    System.out.print("Angka 2: "); double b4 = in.nextDouble();
                    hasil = kali(a4, b4);
                    break;
                case 5:
                    System.out.print("Angka 1: "); double a5 = in.nextDouble();
                    System.out.print("Angka 2: "); double b5 = in.nextDouble();
                    hasil = bagi(a5, b5);
                    break;
                case 6:
                    System.out.print("Basis: "); double basis = in.nextDouble();
                    System.out.print("Pangkat: "); double exp = in.nextDouble();
                    hasil = pangkat(basis, exp);
                    break;
                case 7:
                    System.out.print("Angka: "); double num = in.nextDouble();
                    hasil = akarKuadrat(num);
                    break;
                case 8:
                    simpanHasil = false;
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    simpanHasil = false;
                    System.out.println("Pilihan tidak ada!");
                    break;
            }
            // Jika melakukan operasi perhitungan, tampilkan dan simpan hasil
            if (simpanHasil) {
                System.out.println("Hasil: " + hasil);
                riwayat[totalRiwayat] = hasil;
                totalRiwayat++;
            }
        }

        // Tampilkan nilai maksimum dari riwayat saat keluar
        System.out.println("\n--- HASIL AKHIR ---");
        if (totalRiwayat > 0) {
            double max = riwayatKeMaksimum(riwayat, totalRiwayat);
            System.out.println("Nilai hasil terbesar: " + max);
        } else {
            System.out.println("Belum ada perhitungan.");
        }
        in.close();
    }
}