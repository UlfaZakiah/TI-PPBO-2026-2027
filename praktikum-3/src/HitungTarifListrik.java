import java.util.Scanner;

public class HitungTarifListrik {

    //Tarif masing masing golongan
    public static final double TARIF_450   = 415.0;
    public static final double TARIF_900   = 1352.0;
    public static final double TARIF_1300  = 1444.70;
    public static final double TARIF_2200  = 1444.70;
    public static final double TARIF_ABOVE = 1700.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println(" =====    PROGRAM PENGHITUNG TARIF LISTRIK PLN    =====");


        //Membaca input daya listrik dalam (VA)
        System.out.println("Pilihan Golongan Daya (VA):");
        System.out.println(" 1. 450 VA");
        System.out.println(" 2. 900 VA");
        System.out.println(" 3. 1300 VA");
        System.out.println(" 4. 2200 VA");
        System.out.println(" 5. Di atas 2200 VA");
        System.out.print("Masukkan daya listrik pilihan Anda: ");
        int daya = scanner.nextInt();

        //Membaca input jumlah pemakaian listrik dalam (kWh)
        System.out.print("Masukkan jumlah pemakaian listrik (kWh): ");
        double pemakaianKwh = scanner.nextDouble();

        //Validasi menggunakan operator logika
        if (pemakaianKwh <= 0) {
            System.out.println("\n[ERROR] Pemakaian kWh tidak valid! Jumlah pemakaian harus lebih besar dari 0.");
        } else {
            double tarifPerKwh = 0.0;
            String namaGolongan = "";
            boolean dayaValid = true;

            //Menentukan tagihan
            if (daya == 450) {
                tarifPerKwh = TARIF_450;
                namaGolongan = "450 VA";
            } else if (daya == 900) {
                tarifPerKwh = TARIF_900;
                namaGolongan = "900 VA";
            } else if (daya == 1300) {
                tarifPerKwh = TARIF_1300;
                namaGolongan = "1300 VA";
            } else if (daya == 2200) {
                tarifPerKwh = TARIF_2200;
                namaGolongan = "2200 VA";
            } else if (daya > 2200) {
                tarifPerKwh = TARIF_ABOVE;
                namaGolongan = daya + " VA (Di atas 2200 VA)";
            } else {
                dayaValid = false;
                System.out.println("\n[ERROR] Golongan daya yang Anda masukkan tidak valid!");
            }

            // Jika golongan daya valid, hitung dan tampilkan hasil
            if (dayaValid) {
                double totalTagihan = pemakaianKwh * tarifPerKwh;

                //Hasil Akhir
                System.out.println("=============================================");
                System.out.println("             RINCIAN TAGIHAN LISTRIK         ");
                System.out.println("=============================================");
                System.out.printf("Golongan Daya     : %s%n", namaGolongan);
                System.out.printf("Pemakaian Listrik : %.2f kWh%n", pemakaianKwh);
                System.out.printf("Tarif per kWh     : Rp %,.2f%n", tarifPerKwh);
                System.out.println("---------------------------------------------");
                System.out.printf("TOTAL TAGIHAN     : Rp %,.2f%n", totalTagihan);
                System.out.println("=============================================");
            }
        }

        scanner.close();
    }
}
